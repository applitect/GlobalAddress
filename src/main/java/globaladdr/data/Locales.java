package globaladdr.data;

import static globaladdr.data.LocaleLabel.CNTY;
import static globaladdr.data.LocaleLabel.DEPT;
import static globaladdr.data.LocaleLabel.DSTR;
import static globaladdr.data.LocaleLabel.GVRT;
import static globaladdr.data.LocaleLabel.MLRY;
import static globaladdr.data.LocaleLabel.PROV;
import static globaladdr.data.LocaleLabel.PRSH;
import static globaladdr.data.LocaleLabel.REGN;
import static globaladdr.data.LocaleLabel.STAT;
import static globaladdr.data.LocaleLabel.TERR;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Locales {
    private Map<String, Locale> locales;

    static Locales getGB() {
        Map<String, Locale> loc = new TreeMap<String, Locale>();
        loc.put("AB", new Locale(CNTY,"AB","ABERDEEN"));
        loc.put("AL", new Locale(CNTY,"AL","ST. ALBANS"));
        loc.put("B", new Locale(CNTY,"B","BIRMINGHAM"));
        loc.put("BA", new Locale(CNTY,"BA","BATH"));
        loc.put("BB", new Locale(CNTY,"BB","BLACKBURN"));
        loc.put("BD", new Locale(CNTY,"BD","BRADFORD"));
        loc.put("BH", new Locale(CNTY,"BH","BOURNEMOUTH"));
        loc.put("BL", new Locale(CNTY,"BL","BOLTON"));
        loc.put("BN", new Locale(CNTY,"BN","BRIGHTON"));
        loc.put("BR", new Locale(CNTY,"BR","BROMLEY"));
        loc.put("SB", new Locale(CNTY,"SB","BRISTOL"));
        loc.put("BT", new Locale(CNTY,"BT","NORTHERN IRELAND"));
        loc.put("CA", new Locale(CNTY,"CA","CARLISLE"));
        loc.put("CB", new Locale(CNTY,"CB","CAMBRIDGE"));
        loc.put("CF", new Locale(CNTY,"CF","CARDIFF"));
        loc.put("CH", new Locale(CNTY,"CH","CHESTER"));
        loc.put("CM", new Locale(CNTY,"CM","CHELMSFORD"));
        loc.put("CO", new Locale(CNTY,"CO","COLCHESTER"));
        loc.put("CR", new Locale(CNTY,"CR","CROYDON"));
        loc.put("CT", new Locale(CNTY,"CT","CANTERBURY"));
        loc.put("CV", new Locale(CNTY,"CV","COVENTRY"));
        loc.put("CW", new Locale(CNTY,"CW","CREWE"));
        loc.put("DA", new Locale(CNTY,"DA","DARTFORD"));
        loc.put("DD", new Locale(CNTY,"DD","DUNDEE"));
        loc.put("DE", new Locale(CNTY,"DE","DERBY"));
        loc.put("DG", new Locale(CNTY,"DG","DUMFRIES"));
        loc.put("DH", new Locale(CNTY,"DH","DURHAM"));
        loc.put("DL", new Locale(CNTY,"DL","DARLINGTON"));
        loc.put("DN", new Locale(CNTY,"DN","DONCASTER"));
        loc.put("DT", new Locale(CNTY,"DT","DORCHESTER"));
        loc.put("DY", new Locale(CNTY,"DY","DUDLEY"));
        loc.put("E", new Locale(CNTY,"E","LONDON E"));
        loc.put("EN", new Locale(CNTY,"EN","ENFIELD"));
        loc.put("EC", new Locale(CNTY,"EC","LONDON EC"));
        loc.put("EH", new Locale(CNTY,"EH","EDINBURGH"));
        loc.put("EX", new Locale(CNTY,"EX","EXETER"));
        loc.put("FK", new Locale(CNTY,"FK","FALKIRK"));
        loc.put("FY", new Locale(CNTY,"FY","BLACKPOOL"));
        loc.put("G", new Locale(CNTY,"G","GLASGOW"));
        loc.put("GL", new Locale(CNTY,"GL","GLOUCHESTER"));
        loc.put("GY", new Locale(CNTY,"GY","GUERNSEY"));
        loc.put("GU", new Locale(CNTY,"GU","GUILDFORD"));
        loc.put("HA", new Locale(CNTY,"HA","HARROW"));
        loc.put("HD", new Locale(CNTY,"HD","HUDDERSFIELD"));
        loc.put("HGO", new Locale(CNTY,"HGO","HARROGATE"));
        loc.put("HP", new Locale(CNTY,"HP","HEMEL HEMPSTEAD"));
        loc.put("HR", new Locale(CNTY,"HR","HEREFORD"));
        loc.put("HS", new Locale(CNTY,"HS","OUTER HEBRIDES"));
        loc.put("HU", new Locale(CNTY,"HU","HULL"));
        loc.put("HX", new Locale(CNTY,"HX","HALIFAX"));
        loc.put("IG", new Locale(CNTY,"IG","ILFORD"));
        loc.put("IM", new Locale(CNTY,"IM","ISLE OF MAN"));
        loc.put("IP", new Locale(CNTY,"IP","IPSWICH"));
        loc.put("IV", new Locale(CNTY,"IV","INVERNESS"));
        loc.put("JE", new Locale(CNTY,"JE","JERSEY"));
        loc.put("KA", new Locale(CNTY,"KA","KILMARNOCK"));
        loc.put("KT", new Locale(CNTY,"KT","KINGSTON UPON THAMES"));
        loc.put("KW", new Locale(CNTY,"KW","KIRKWALL"));
        loc.put("KY", new Locale(CNTY,"KY","KIRKCALDY"));
        loc.put("L", new Locale(CNTY,"L","LIVERPOOL"));
        loc.put("LA", new Locale(CNTY,"LA","LANCASTER"));
        loc.put("LD", new Locale(CNTY,"LD","LLANDRINDOD WELLS"));
        loc.put("LE", new Locale(CNTY,"LE","LEICESTER"));
        loc.put("LL", new Locale(CNTY,"LL","LLANDUDNO"));
        loc.put("LN", new Locale(CNTY,"LN","LINCOLN"));
        loc.put("LS", new Locale(CNTY,"LS","LEEDS"));
        loc.put("LU", new Locale(CNTY,"LU","LUTON"));
        loc.put("MD", new Locale(CNTY,"MD","MANCHESTER"));
        loc.put("MEX", new Locale(CNTY,"MEX","MEDWAY"));
        loc.put("MK", new Locale(CNTY,"MK","MILTON KEYNES"));
        loc.put("ML", new Locale(CNTY,"ML","MOTHERWELL"));
        loc.put("N", new Locale(CNTY,"N","LONDON N"));
        loc.put("NE", new Locale(CNTY,"NE","NEWCASTLE UPON TYNE"));
        loc.put("NG", new Locale(CNTY,"NG","NOTTINGHAM"));
        loc.put("NN", new Locale(CNTY,"NN","NORTHAMPTON"));
        loc.put("NP", new Locale(CNTY,"NP","NEWPORT"));
        loc.put("NR", new Locale(CNTY,"NR","NORWICH"));
        loc.put("NW", new Locale(CNTY,"NW","LONDON NW"));
        loc.put("OL", new Locale(CNTY,"OL","OLDHAM"));
        loc.put("OX", new Locale(CNTY,"OX","OXFORD"));
        loc.put("PA", new Locale(CNTY,"PA","PAISLEY"));
        loc.put("PE", new Locale(CNTY,"PE","PETERBOROUGH"));
        loc.put("PH", new Locale(CNTY,"PH","PERTH"));
        loc.put("PL", new Locale(CNTY,"PL","PLYMOUTH"));
        loc.put("PO", new Locale(CNTY,"PO","PORTSMOUTH"));
        loc.put("PR", new Locale(CNTY,"PR","RRESTON"));
        loc.put("RG", new Locale(CNTY,"RG","READING"));
        loc.put("RH", new Locale(CNTY,"RH","REDHILL"));
        loc.put("RM", new Locale(CNTY,"RM","ROMFORD"));
        loc.put("S", new Locale(CNTY,"S","SHEFFIELD"));
        loc.put("SA", new Locale(CNTY,"SA","SWANSEA"));
        loc.put("SE", new Locale(CNTY,"SE","LONDON SE"));
        loc.put("SG", new Locale(CNTY,"SG","STEVENAGE"));
        loc.put("SK", new Locale(CNTY,"SK","STOCKPORT"));
        loc.put("SLP", new Locale(CNTY,"SLP","SLOUGH"));
        loc.put("SM", new Locale(CNTY,"SM","SUTTON"));
        loc.put("SN", new Locale(CNTY,"SN","SWINDON"));
        loc.put("SO", new Locale(CNTY,"SO","SOUTHAMPTON"));
        loc.put("SP", new Locale(CNTY,"SP","SALISBURY"));
        loc.put("SR", new Locale(CNTY,"SR","SUNDERLAND"));
        loc.put("SS", new Locale(CNTY,"SS","SOUTHEND ON SEA"));
        loc.put("ST", new Locale(CNTY,"ST","STOKE ON TRENT"));
        loc.put("SW", new Locale(CNTY,"SW","LONDON SW"));
        loc.put("SY", new Locale(CNTY,"SY","SHREWSBURY"));
        loc.put("TA", new Locale(CNTY,"TA","TAUNTON"));
        loc.put("TD", new Locale(CNTY,"TD","GALASHIELS"));
        loc.put("TF", new Locale(CNTY,"TF","TELFORD"));
        loc.put("TN", new Locale(CNTY,"TN","TONBRIDGE"));
        loc.put("TQ", new Locale(CNTY,"TQ","TORQUAY"));
        loc.put("TR", new Locale(CNTY,"TR","TRURO"));
        loc.put("TS", new Locale(CNTY,"TS","CLEVELAND"));
        loc.put("TW", new Locale(CNTY,"TW","TWICKENHAM"));
        loc.put("UB", new Locale(CNTY,"UB","SOUTHALL"));
        loc.put("W", new Locale(CNTY,"W","LONDON W"));
        loc.put("WA", new Locale(CNTY,"WA","WARRINGTON"));
        loc.put("WC", new Locale(CNTY,"WC","LONDON WC"));
        loc.put("WD", new Locale(CNTY,"WD","WATFORD"));
        loc.put("WF", new Locale(CNTY,"WF","WAKEFIELD"));
        loc.put("WN", new Locale(CNTY,"WN","WIGAN"));
        loc.put("WR", new Locale(CNTY,"WR","WORCESTER"));
        loc.put("WS", new Locale(CNTY,"WS","WALSALL"));
        loc.put("WV", new Locale(CNTY,"WV","WOLVERHAMPTON"));
        loc.put("YO", new Locale(CNTY,"YO","YORK"));
        loc.put("ZE", new Locale(CNTY,"ZE","LERWICK"));
        Locales instance = new Locales();
        instance.locales = Collections.unmodifiableMap(loc);
        return instance;
    }

    static Locales getUY() {
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
        Locales instance = new Locales();
        instance.locales = Collections.unmodifiableMap(loc);
        return instance;
    }

    static Locales getVE() {
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
        loc.put("ZU", new Locale(STAT,"ZU","ZULIA"));        Locales instance = new Locales();
        instance.locales = Collections.unmodifiableMap(loc);
        return instance;
    }

    static Locales getYE() {
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
        loc.put("TA", new Locale(GVRT,"TA","TA'IZZ"));        Locales instance = new Locales();
        instance.locales = Collections.unmodifiableMap(loc);
        return instance;
    }

    static Locales getZW() {
        Map<String, Locale> loc = new TreeMap<String, Locale>();
        loc.put("BU", new Locale(PROV,"BU","BULAWAYO"));
        loc.put("HA", new Locale(PROV,"HA","HARARE"));
        loc.put("MA", new Locale(PROV,"MA","MANICALAND"));
        loc.put("MC", new Locale(PROV,"MC","MASHONALAND CENTRAL"));
        loc.put("ME", new Locale(PROV,"ME","MASHONALAND EAST"));
        loc.put("MW", new Locale(PROV,"MW","MASHONALAND WEST"));
        loc.put("MV", new Locale(PROV,"MV","MASVINGO"));
        loc.put("MN", new Locale(PROV,"MN","MATABELELAND NORTH"));
        loc.put("MS", new Locale(PROV,"MS","MATABELELAND SOUTH"));
        loc.put("MI", new Locale(PROV,"MI","MIDLANDS"));        Locales instance = new Locales();
        instance.locales = Collections.unmodifiableMap(loc);
        return instance;
    }

    static Locales getUS() {
        Map<String, Locale> loc = new TreeMap<String, Locale>();
        loc.put("AK", new Locale(STAT,"AK","ALASKA"));
        loc.put("AL", new Locale(STAT,"AL","ALABAMA"));
        loc.put("AR", new Locale(STAT,"AR","ARKANSAS"));
        loc.put("AZ", new Locale(STAT,"AZ","ARIZONA"));
        loc.put("CA", new Locale(STAT,"CA","CALIFORNIA"));
        loc.put("CO", new Locale(STAT,"CO","COLORADO"));
        loc.put("CT", new Locale(STAT,"CT","CONNECTICUT"));
        loc.put("DE", new Locale(STAT,"DE","DELAWARE"));
        loc.put("FL", new Locale(STAT,"FL","FLORIDA"));
        loc.put("GA", new Locale(STAT,"GA","GEORGIA"));
        loc.put("HI", new Locale(STAT,"HI","HAWAII"));
        loc.put("IA", new Locale(STAT,"IA","IOWA"));
        loc.put("ID", new Locale(STAT,"ID","IDAHO"));
        loc.put("IL", new Locale(STAT,"IL","ILLINOIS"));
        loc.put("IN", new Locale(STAT,"IN","INDIANA"));
        loc.put("KS", new Locale(STAT,"KS","KANSAS"));
        loc.put("KY", new Locale(STAT,"KY","KENTUCKY"));
        loc.put("LA", new Locale(STAT,"LA","LOUISIANA"));
        loc.put("MA", new Locale(STAT,"MA","MASSACHUSETTS"));
        loc.put("MD", new Locale(STAT,"MD","MARYLAND"));
        loc.put("ME", new Locale(STAT,"ME","MAINE"));
        loc.put("MI", new Locale(STAT,"MI","MICHIGAN"));
        loc.put("MN", new Locale(STAT,"MN","MINNESOTA"));
        loc.put("MO", new Locale(STAT,"MO","MISSOURI"));
        loc.put("MS", new Locale(STAT,"MS","MISSISSIPPI"));
        loc.put("MT", new Locale(STAT,"MT","MONTANA"));
        loc.put("NC", new Locale(STAT,"NC","NORTH CAROLINA"));
        loc.put("ND", new Locale(STAT,"ND","NORTH DAKOTA"));
        loc.put("NE", new Locale(STAT,"NE","NEBRASKA"));
        loc.put("NH", new Locale(STAT,"NH","NEW HAMPSHIRE"));
        loc.put("NJ", new Locale(STAT,"NJ","NEW JERSEY"));
        loc.put("NM", new Locale(STAT,"NM","NEW MEXICO"));
        loc.put("NV", new Locale(STAT,"NV","NEVADA"));
        loc.put("NY", new Locale(STAT,"NY","NEW YORK"));
        loc.put("OH", new Locale(STAT,"OH","OHIO"));
        loc.put("OK", new Locale(STAT,"OK","OKLAHOMA"));
        loc.put("OR", new Locale(STAT,"OR","OREGON"));
        loc.put("PA", new Locale(STAT,"PA","PENNSYLVANIA"));
        loc.put("RI", new Locale(STAT,"RI","RHODE ISLAND"));
        loc.put("SC", new Locale(STAT,"SC","SOUTH CAROLINA"));
        loc.put("SD", new Locale(STAT,"SD","SOUTH DAKOTA"));
        loc.put("TN", new Locale(STAT,"TN","TENNESSEE"));
        loc.put("TX", new Locale(STAT,"TX","TEXAS"));
        loc.put("UT", new Locale(STAT,"UT","UTAH"));
        loc.put("VA", new Locale(STAT,"VA","VIRGINIA"));
        loc.put("VT", new Locale(STAT,"VT","VERMONT"));
        loc.put("WA", new Locale(STAT,"WA","WASHINGTON"));
        loc.put("WI", new Locale(STAT,"WI","WISCONSIN"));
        loc.put("WV", new Locale(STAT,"WV","WEST VIRGINIA"));
        loc.put("WY", new Locale(STAT,"WY","WYOMING"));
        loc.put("AS", new Locale(TERR,"AS","AMERICAN SAMOA"));
        loc.put("GU", new Locale(TERR,"GU","GUAM"));
        loc.put("MP", new Locale(TERR,"MP","NORTHERN MARIANA ISLANDS"));
        loc.put("PR", new Locale(TERR,"PR","PUERTO RICO"));
        loc.put("VI", new Locale(TERR,"VI","U.S. VIRGIN ISLANDS"));
        loc.put("UM", new Locale(TERR,"UM","U.S. MINOR OUTLYING ISLANDS"));
        loc.put("FM", new Locale(TERR,"FM","FEDERATED STATES OF MICRONESIA"));
        loc.put("MH", new Locale(TERR,"MH","MARSHALL ISLANDS"));
        loc.put("PW", new Locale(TERR,"PW","PALAU"));
        loc.put("CZ", new Locale(TERR,"CZ","CANAL ZONE"));
        loc.put("TT", new Locale(TERR,"TT","TRUST TERR OF THE PACIFIC ISLDS"));
        loc.put("DC", new Locale(STAT,"DC","WASHINGTON DC"));
        loc.put("AA", new Locale(MLRY,"AA","ARMED FORCES - CNT/S AMERICA"));
        loc.put("AE", new Locale(MLRY,"AE","ARMED FORCES - EUROPE"));
        loc.put("AP", new Locale(MLRY,"AP","ARMED FORCES - PACIFIC"));
        Locales instance = new Locales();
        instance.locales = Collections.unmodifiableMap(loc);
        return instance;
    }

    static Locales getAU() {
        Map<String, Locale> loc = new TreeMap<String, Locale>();
        loc.put("ACT", new Locale(STAT,"ACT","AUSTRALIAN CAPITAL TERRITORY"));
        loc.put("NSW", new Locale(STAT,"NSW","NEW SOUTH WALES"));
        loc.put("NT", new Locale(STAT,"NT","NORTHERN TERRITORY"));
        loc.put("QLD", new Locale(STAT,"QLD","QUEENSLAND"));
        loc.put("SA", new Locale(STAT,"SA","SOUTH AUSTRALIA"));
        loc.put("TAS", new Locale(STAT,"TAS","TASMANIA"));
        loc.put("VIC", new Locale(STAT,"VIC","VICTORIA"));
        loc.put("WA", new Locale(STAT,"WA","WESTERN AUSTRALIA"));
        Locales instance = new Locales();
        instance.locales = Collections.unmodifiableMap(loc);
        return instance;
    }

    static Locales getBR() {
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
        Locales instance = new Locales();
        instance.locales = Collections.unmodifiableMap(loc);
        return instance;
    }

    static Locales getCA() {
        Map<String, Locale> loc = new TreeMap<String, Locale>();
        loc.put("AB", new Locale(PROV,"AB","ALBERTA"));
        loc.put("BC", new Locale(PROV,"BC","BRITISH COLUMBIA"));
        loc.put("MB", new Locale(PROV,"MB","MANITOBA"));
        loc.put("NB", new Locale(PROV,"NB","NEW BRUNSWICK"));
        loc.put("NL", new Locale(PROV,"NL","NEWFOUNDLAND AND LABRADOR"));
        loc.put("NT", new Locale(PROV,"NT","NORTHWEST TERRITORIES"));
        loc.put("NS", new Locale(PROV,"NS","NOVA SCOTIA"));
        loc.put("NU", new Locale(PROV,"NU","NUNAVUT"));
        loc.put("ON", new Locale(PROV,"ON","ONTARIO"));
        loc.put("PE", new Locale(PROV,"PE","PRINCE EDWARD ISLAND"));
        loc.put("QC", new Locale(PROV,"QC","QUEBEC"));
        loc.put("SK", new Locale(PROV,"SK","SASKATCHEWAN"));
        loc.put("YT", new Locale(PROV,"YT","YUKON"));
        Locales instance = new Locales();
        instance.locales = Collections.unmodifiableMap(loc);
        return instance;
    }

    static Locales getCX() {
        Map<String, Locale> loc = new TreeMap<String, Locale>();
        loc.put("WA", new Locale(STAT,"WA","WESTERN AUSTRALIA"));
        Locales instance = new Locales();
        instance.locales = Collections.unmodifiableMap(loc);
        return instance;
    }

    static Locales getCC() {
        Map<String, Locale> loc = new TreeMap<String, Locale>();
        loc.put("WA", new Locale(STAT,"WA","WESTERN AUSTRALIA"));
        Locales instance = new Locales();
        instance.locales = Collections.unmodifiableMap(loc);
        return instance;
    }

    static Locales getHN() {
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
        Locales instance = new Locales();
        instance.locales = Collections.unmodifiableMap(loc);
        return instance;
    }

    static Locales getIQ() {
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
        Locales instance = new Locales();
        instance.locales = Collections.unmodifiableMap(loc);
        return instance;
    }

    static Locales getIT() {
        Map<String, Locale> loc = new TreeMap<String, Locale>();
        loc.put("AG", new Locale(PROV,"AG","AGRIGENTO"));
        loc.put("AL", new Locale(PROV,"AL","ALESSANDRIA"));
        loc.put("AN", new Locale(PROV,"AN","ANCONA"));
        loc.put("AO", new Locale(PROV,"AO","AOSTA"));
        loc.put("AP", new Locale(PROV,"AP","ASCOLI PICENO"));
        loc.put("AQ", new Locale(PROV,"AQ","L'AQUILA"));
        loc.put("AR", new Locale(PROV,"AR","AREZZO"));
        loc.put("AT", new Locale(PROV,"AT","ASTI"));
        loc.put("AV", new Locale(PROV,"AV","AVELLINO"));
        loc.put("BA", new Locale(PROV,"BA","BARI"));
        loc.put("BG", new Locale(PROV,"BG","BERGAMO"));
        loc.put("BI", new Locale(PROV,"BI","BIELLA"));
        loc.put("BL", new Locale(PROV,"BL","BELLUNO"));
        loc.put("BN", new Locale(PROV,"BN","BENEVENTO"));
        loc.put("BO", new Locale(PROV,"BO","BOLOGNA"));
        loc.put("BR", new Locale(PROV,"BR","BRINDISI"));
        loc.put("BS", new Locale(PROV,"BS","BRESCIA"));
        loc.put("BZ", new Locale(PROV,"BZ","BOLZANO"));
        loc.put("CA", new Locale(PROV,"CA","CAGLIARI"));
        loc.put("CB", new Locale(PROV,"CB","CAMPOBASSO"));
        loc.put("CE", new Locale(PROV,"CE","CASERTA"));
        loc.put("CH", new Locale(PROV,"CH","CHIETI"));
        loc.put("CL", new Locale(PROV,"CL","CALTANISSETTA"));
        loc.put("CN", new Locale(PROV,"CN","CUNEO"));
        loc.put("CO", new Locale(PROV,"CO","COMO"));
        loc.put("CR", new Locale(PROV,"CR","CREMONA"));
        loc.put("CS", new Locale(PROV,"CS","COSENZA"));
        loc.put("CT", new Locale(PROV,"CT","CATANIA"));
        loc.put("CZ", new Locale(PROV,"CZ","CATANZARO"));
        loc.put("EN", new Locale(PROV,"EN","ENNA"));
        loc.put("FE", new Locale(PROV,"FE","FERRARA"));
        loc.put("FG", new Locale(PROV,"FG","FOGGIA"));
        loc.put("FI", new Locale(PROV,"FI","FIRENZE"));
        loc.put("FO", new Locale(PROV,"FO","FORLI"));
        loc.put("FR", new Locale(PROV,"FR","FROSINONE"));
        loc.put("GE", new Locale(PROV,"GE","GENOVA"));
        loc.put("GO", new Locale(PROV,"GO","GORIZIA"));
        loc.put("GR", new Locale(PROV,"GR","GROSSETO"));
        loc.put("IM", new Locale(PROV,"IM","IMPERIA"));
        loc.put("IS", new Locale(PROV,"IS","ISERNIA"));
        loc.put("KR", new Locale(PROV,"KR","CROTONE"));
        loc.put("LC", new Locale(PROV,"LC","LECCO"));
        loc.put("LE", new Locale(PROV,"LE","LECCE"));
        loc.put("LI", new Locale(PROV,"LI","LIVORNA"));
        loc.put("LO", new Locale(PROV,"LO","LODI"));
        loc.put("LT", new Locale(PROV,"LT","LATINA"));
        loc.put("LU", new Locale(PROV,"LU","LUCCA"));
        loc.put("MC", new Locale(PROV,"MC","MACERATA"));
        loc.put("ME", new Locale(PROV,"ME","MESSINA"));
        loc.put("MI", new Locale(PROV,"MI","MILANO"));
        loc.put("MN", new Locale(PROV,"MN","MANTOVA"));
        loc.put("MO", new Locale(PROV,"MO","MODENA"));
        loc.put("MS", new Locale(PROV,"MS","MASSA CARRARA"));
        loc.put("MT", new Locale(PROV,"MT","MATERA"));
        loc.put("NA", new Locale(PROV,"NA","NAPOLI"));
        loc.put("NO", new Locale(PROV,"NO","NOVARA"));
        loc.put("NU", new Locale(PROV,"NU","NUORO"));
        loc.put("OR", new Locale(PROV,"OR","ORISTANO"));
        loc.put("PA", new Locale(PROV,"PA","PALERMO"));
        loc.put("PC", new Locale(PROV,"PC","PIACENZA"));
        loc.put("PD", new Locale(PROV,"PD","PADOVA"));
        loc.put("PE", new Locale(PROV,"PE","PESCARA"));
        loc.put("PG", new Locale(PROV,"PG","PERUGIA"));
        loc.put("PI", new Locale(PROV,"PI","PISA"));
        loc.put("PN", new Locale(PROV,"PN","PORDENONE"));
        loc.put("PR", new Locale(PROV,"PR","PARMA"));
        loc.put("PS", new Locale(PROV,"PS","PESARO"));
        loc.put("PT", new Locale(PROV,"PT","PISTOIA"));
        loc.put("PV", new Locale(PROV,"PV","PAVIA"));
        loc.put("PO", new Locale(PROV,"PO","PRATO"));
        loc.put("PZ", new Locale(PROV,"PZ","POTENZA"));
        loc.put("RA", new Locale(PROV,"RA","RAVENNA"));
        loc.put("RC", new Locale(PROV,"RC","REGGIO CALABRIA"));
        loc.put("RE", new Locale(PROV,"RE","REGGIO EMILIA"));
        loc.put("RG", new Locale(PROV,"RG","RAGUSA"));
        loc.put("RI", new Locale(PROV,"RI","RIETI"));
        loc.put("RM", new Locale(PROV,"RM","ROMA"));
        loc.put("RN", new Locale(PROV,"RN","RIMINI"));
        loc.put("RO", new Locale(PROV,"RO","ROVIGO"));
        loc.put("SA", new Locale(PROV,"SA","SALERNO"));
        loc.put("SI", new Locale(PROV,"SI","SIENA"));
        loc.put("SO", new Locale(PROV,"SO","SONDRIO"));
        loc.put("SP", new Locale(PROV,"SP","LA SPEZIA"));
        loc.put("SR", new Locale(PROV,"SR","SIRACUSA"));
        loc.put("SS", new Locale(PROV,"SS","SASSARI"));
        loc.put("SV", new Locale(PROV,"SV","SAVONA"));
        loc.put("TAS", new Locale(PROV,"TAS","TARANTO"));
        loc.put("TE", new Locale(PROV,"TE","TERAMO"));
        loc.put("TN", new Locale(PROV,"TN","TRENTO"));
        loc.put("TO", new Locale(PROV,"TO","TORINO"));
        loc.put("TP", new Locale(PROV,"TP","TRAPANI"));
        loc.put("TR", new Locale(PROV,"TR","TERNI"));
        loc.put("TS", new Locale(PROV,"TS","TRIESTE"));
        loc.put("TV", new Locale(PROV,"TV","TREVISO"));
        loc.put("UD", new Locale(PROV,"UD","UDINE"));
        loc.put("VA", new Locale(PROV,"VA","VARESS"));
        loc.put("VC", new Locale(PROV,"VC","VERCELLI"));
        loc.put("VE", new Locale(PROV,"VE","VENEZIA"));
        loc.put("VIC", new Locale(PROV,"VIC","VICENZA"));
        loc.put("VB", new Locale(PROV,"VB","VERBANIA"));
        loc.put("VR", new Locale(PROV,"VR","VERONA"));
        loc.put("VT", new Locale(PROV,"VT","VITERBO"));
        loc.put("VV", new Locale(PROV,"VV","VIBO VALENTIA"));
        Locales instance = new Locales();
        instance.locales = Collections.unmodifiableMap(loc);
        return instance;
    }

    static Locales getJM() {
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
        Locales instance = new Locales();
        instance.locales = Collections.unmodifiableMap(loc);
        return instance;
    }

    static Locales getMX() {
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
        Locales instance = new Locales();
        instance.locales = Collections.unmodifiableMap(loc);
        return instance;
    }

    static Locales getSO() {
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
        Locales instance = new Locales();
        instance.locales = Collections.unmodifiableMap(loc);
        return instance;
    }

    static Locales getSR() {
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
        Locales instance = new Locales();
        instance.locales = Collections.unmodifiableMap(loc);
        return instance;
    }

    public Map<String, String> getLocales() {
        Map<String, String> list = new TreeMap<String, String>();
        for (Locale l : locales.values()) {
            list.put(l.getCode(), l.getName());
        }
        return Collections.unmodifiableMap(list);
    }

    public Map<String, String> getLocales(LocaleLabel type) {
        Map<String, String> list = new TreeMap<String, String>();
        for (Locale l : locales.values()) {
            if (l.getType() == type)
                list.put(l.getCode(), l.getName());
        }
        return Collections.unmodifiableMap(list);
    }

    public Map<String, String> getLocales(Set<LocaleLabel> types) {
        Map<String, String> list = new TreeMap<String, String>();
        for (Locale l : locales.values()) {
            if (types.contains(l.getType()))
                list.put(l.getCode(), l.getName());
        }
        return Collections.unmodifiableMap(list);
    }

    public List<OptionItem> getLocalesList() {
        List<OptionItem> list = new ArrayList<OptionItem>();
        for (Locale l : locales.values()) {
            list.add(new OptionItem(l.getCode(), l.getName()));
        }
        return Collections.unmodifiableList(list);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Locales [locales=").append(locales);
        for (Entry<String, Locale> l : locales.entrySet()) {
            builder.append(l.getKey() + " : " + l.getValue());
        }
        builder.append("]");
        return builder.toString();
    }
}
