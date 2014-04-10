package globaladdr.data;

import static globaladdr.data.CityLabel.CATL;
import static globaladdr.data.CityLabel.CCTY;
import static globaladdr.data.CityLabel.CDFC;
import static globaladdr.data.CityLabel.CDPT;
import static globaladdr.data.CityLabel.CDSR;
import static globaladdr.data.CityLabel.CEMT;
import static globaladdr.data.CityLabel.CISL;
import static globaladdr.data.CityLabel.CITY;
import static globaladdr.data.CityLabel.CLCL;
import static globaladdr.data.CityLabel.CPRH;
import static globaladdr.data.CityLabel.DLCT;
import static globaladdr.data.CityLabel.DLVY;
import static globaladdr.data.CityLabel.DTMC;
import static globaladdr.data.CityLabel.LCDS;
import static globaladdr.data.CityLabel.MUNI;
import static globaladdr.data.CityLabel.PRFR;
import static globaladdr.data.CityLabel.PTWN;
import static globaladdr.data.CityLabel.PZNE;
import static globaladdr.data.CityLabel.QUAR;
import static globaladdr.data.CityLabel.SUBR;
import static globaladdr.data.CityLabel.TDST;
import static globaladdr.data.CityLabel.TOWN;
import static globaladdr.data.CityLabel.VLGE;
import static globaladdr.data.LocaleLabel.CNTN;
import static globaladdr.data.LocaleLabel.CNTY;
import static globaladdr.data.LocaleLabel.CTCY;
import static globaladdr.data.LocaleLabel.DEPT;
import static globaladdr.data.LocaleLabel.DLCL;
import static globaladdr.data.LocaleLabel.DOFC;
import static globaladdr.data.LocaleLabel.DSTR;
import static globaladdr.data.LocaleLabel.GVRT;
import static globaladdr.data.LocaleLabel.ISLD;
import static globaladdr.data.LocaleLabel.LCD;
import static globaladdr.data.LocaleLabel.LOCL;
import static globaladdr.data.LocaleLabel.MNIL;
import static globaladdr.data.LocaleLabel.PROV;
import static globaladdr.data.LocaleLabel.PRSH;
import static globaladdr.data.LocaleLabel.REGN;
import static globaladdr.data.LocaleLabel.STAT;
import static globaladdr.data.LocaleLabel.TWNS;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Countries {
    private static Countries instance = null;
    private static Map<String, Country> LIST;

    public Countries(){}

    private static Map<String, Country> initializeMap() {
        Map<String, Country> list = new HashMap<String, Country>();
        list.put("NU", new Country("NU","NIUE","NEW ZEALAND",TOWN,null,"6001","\\d{4}","683",false,-11,null, null));
        list.put("NF", new Country("NF","NORFOLK ISLAND","AUSTRALIA",CITY,STAT,"2060","\\d{4}","672",false,11.5,null, null));
        list.put("NO", new Country("NO","NORWAY","NORWAY",TOWN,null,"0025","\\d{4}","47",false,1,null, null));
        list.put("OM", new Country("OM","OMAN","OMAN",CLCL,null,"133","\\d{3}","968",false,4,null, null));
        list.put("PK", new Country("PK","PAKISTAN","PAKISTAN",CLCL,null,"44000","\\d{5}","92",false,5,null, null));
        list.put("PS", new Country("PS","PALESTINIAN AUTHORITY","VIA ISRAEL",TOWN,null,null,null,"970",false,2,null, null));
        list.put("PA", new Country("PA","PANAMA","PANAMA (REP.)",CLCL,PROV,null,null,"507",false,-5,null, null));
        list.put("PG", new Country("PG","PAPUA NEW GUINEA","PAPUA NEW GUINEA",CLCL,PROV,"111","\\d{3}","675",false,10,null, null));
        list.put("PY", new Country("PY","PARAGUAY","PARAGUAY",CLCL,null,"1536","\\d{4}","595",false,-4,null, null));
        list.put("PE", new Country("PE","PERU","PERU",CITY,null,"12",".*","51",false,-5,null, null));
        list.put("PH", new Country("PH","PHILIPPINES","PHILIPPINES",CLCL,PROV,"1008","\\d{4}","63",false,8,null, null));
        list.put("PN", new Country("PN","PITCAIRN","PITCAIRN",TOWN,null,"PCRN 1ZZ","PCRN[ ]1ZZ","872",false,8.5,null, null));
        list.put("PL", new Country("PL","POLAND","POLSKA / POLAND",PTWN,null,"00-950","\\d{2}-\\d{3}","48",false,1,null, null));
        list.put("PT", new Country("PT","PORTUGAL","PORTUGAL",PTWN,null,"2725-079","\\d{4}-\\d{3}","351",false,1,null, null));
        list.put("QA", new Country("QA","QATAR","QATAR",CLCL,null,null,null,"974",false,3,null, null));
        list.put("RE", new Country("RE","REUNION","FRANCE",CITY,null,"97400","(97|98)(4|7|8)\\d{2}","262",false,4,null, null));
        list.put("RO", new Country("RO","ROMANIA","ROMANIA",CLCL,null,"060274","\\d{6}","40",false,2,null, null));
        list.put("RU", new Country("RU","RUSSIAN FEDERATION","RUSSIAN FEDERATION",TDST,PROV,"125075","\\d{6}","7",false,6,null, null));
        list.put("RW", new Country("RW","RWANDA","RWANDA",PRFR,null,null,null,"250",false,2,null, null));
        list.put("SH", new Country("SH","SAINT HELENA","SAINT HELENA",PTWN,null,"STHL 1ZZ","STHL[ ]1ZZ","290",false,0,null, null));
        list.put("KN", new Country("KN","SAINT KITTS AND NEVIS","ST. KITTS AND NEVIS",CLCL,null,null,null,null,false,-4,null, null));
        list.put("LC", new Country("LC","SAINT LUCIA","SAINT LUCIA",QUAR,null,null,null,null,false,-4,null, null));
        list.put("AR", new Country("AR","ARGENTINA","ARGENTINA",CLCL,null,"Y5900FNF","[A-Z]\\d{4}[A-Z]{3}","54",false,-3,null, null));
        list.put("BD", new Country("BD","BANGLADESH","BANGLADESH",CLCL,null,"1340","\\d{4}","880",false,6,null, null));
        list.put("BA", new Country("BA","BOSNIA AND HERZEGOVINA","BOSNIA AND HERZEGOVINA",CLCL,null,"71000","\\d{5}","384",false,1,null, null));
        list.put("TF", new Country("TF","FRENCH SOUTHERN TERRITORIES","FRENCH SOUTHERN TERRITORIES",CLCL,null,"33380","\\d{5}","262",false,5,null, null));
        list.put("GG", new Country("GG","GUERNSEY","UNITED KINGDOM",TOWN,CNTY,"GY1 1AA","(([A-Z]{1,2})([0-9]{1,2}[A-Z]?[ ])(\\d[A-Z]{2}))|GIR[ ]0AA","44",false,1,null, null));
        list.put("IR", new Country("IR","IRAN, ISLAMIC REPUBLIC OF","IRAN (ISLAMIC REP.)",TOWN,null,"1193653471","\\d{10}","98",false,3.5,null, null));
        list.put("KE", new Country("KE","KENYA","KENYA",DLVY,null,"20100","\\d{5}","254",false,3,null, null));
        list.put("LA", new Country("LA","LAO PEOPLE'S DEMOCRATIC REPUBLIC","LAO (PEOPLE'S DEM. REP.)",CLCL,null,"01160","\\d{5}","856",false,7,null, null));
        list.put("LU", new Country("LU","LUXEMBOURG","LUXEMBOURG",CLCL,null,"4750","\\d{4}","352",false,1,null, null));
        list.put("SA", new Country("SA","SAUDI ARABIA","SAUDI ARABIA",TOWN,null,"11564","\\d{5}","966",false,3,null, null));
        list.put("SI", new Country("SI","SLOVENIA","SLOVENIA",CLCL,null,"4000","\\d{4}","386",false,1,null, null));
        list.put("SD", new Country("SD","SUDAN","SUDAN",CLCL,null,"11111","\\d{5}","249",false,2,null, null));
        list.put("TH", new Country("TH","THAILAND","THAILAND",CLCL,PROV,"10150","\\d{5}","66",false,7,null, null));
        list.put("UA", new Country("UA","UKRAINE","UKRAINE",CLCL,PROV,"15432","\\d{5}","380",false,2,null, null));
        list.put("ZM", new Country("ZM","ZAMBIA","ZAMBIA",CLCL,null,"50100","\\d{5}","260",false,2,null, null));
        list.put("TN", new Country("TN","TUNISIA","TUNISIA",TOWN,null,"1002","\\d{4}","216",false,1,null, null));
        list.put("TR", new Country("TR","TURKEY","TURKEY",TOWN,DSTR,"01960","\\d{5}","90",false,2,null, null));
        list.put("TM", new Country("TM","TURKMENISTAN","TURKMENISTAN",TOWN,null,"744000","\\d{6}","993",false,5,null, null));
        list.put("TC", new Country("TC","TURKS AND CAICOS ISLANDS","TURKS AND CAICOS ISLANDS",CISL,null,"TKCA 1ZZ","TKCA[ ]1ZZ",null,false,-5,null, null));
        list.put("TV", new Country("TV","TUVALU","TUVALU",CISL,null,null,null,"688",false,12,null, null));
        list.put("UG", new Country("UG","UGANDA","UGANDA",CLCL,null,null,null,"256",false,3,null, null));
        list.put("AE", new Country("AE","UNITED ARAB EMIRATES","UNITED ARAB EMIRATES",CEMT,null,null,null,"971",false,4,null, null));
        list.put("GB", new Country("GB","UNITED KINGDOM","UNITED KINGDOM",TOWN,null,"EC1Y 8SY","(([A-Z]{1,2})([0-9]{1,2}[A-Z]?[ ])(\\d[A-Z]{2}))|GIR[ ]0AA","44",false,0, Locales.getGB(), null));
        list.put("US", new Country("US","UNITED STATES","UNITED STATES OF AMERICA",CITY,STAT,"59601-4901","\\d{5}[- ]?(\\d{4})?",null,true,-5, Locales.getUS(), null));
        list.put("UY", new Country("UY","URUGUAY","URUGUAY",CLCL,DEPT,"11600","\\d{5}","598",true,-3, Locales.getUY(), null));
        list.put("UZ", new Country("UZ","UZBEKISTAN","UZBEKISTAN",CLCL,null,"702100","\\d{6}","998",false,5,null, null));
        list.put("VU", new Country("VU","VANUATU","VANUATU",CLCL,null,null,null,"678",false,11,null, null));
        list.put("VE", new Country("VE","VENEZUELA","VENEZUELA",CLCL,STAT,"1010","\\d{4}","58",true,-4, Locales.getVE(), null));
        list.put("VN", new Country("VN","VIET NAM","VIET NAM",TOWN,PROV,"123456","\\d{6}","84",false,7,null, null));
        list.put("VG", new Country("VG","VIRGIN ISLANDS, BRITISH","BRITISH VIRGIN ISLANDS",TOWN,null,"VG1110","VG\\d{4}",null,false,-4,null, null));
        list.put("WF", new Country("WF","WALLIS AND FUTUNA","FRANCE",CITY,null,"98600","(97|98)6\\d{2}","684",false,12,null, null));
        list.put("EH", new Country("EH","WESTERN SAHARA","WESTERN SAHARA",CLCL,null,"53000","\\d{5}",null,false,0,null, null));
        list.put("YE", new Country("YE","YEMEN","YEMEN",CLCL,GVRT,null,null,"967",true,3, Locales.getYE(), null));
        list.put("ZW", new Country("ZW","ZIMBABWE","ZIMBABWE",CLCL,PROV,null,null,"263",true,2, Locales.getZW(), null));
        list.put("PM", new Country("PM","SAINT PIERRE AND MIQUELON","FRANCE",CITY,null,"97500","(97|98)5\\d{2}","508",false,-3,null, null));
        list.put("VC", new Country("VC","SAINT VINCENT AND THE GRENADINES","ST. VINCENT AND GRENADINES (ANTILLES)",TOWN,null,null,null,null,false,-4,null, null));
        list.put("WS", new Country("WS","SAMOA","SAMOA",CLCL,null,null,null,"685",false,-11,null, null));
        list.put("SM", new Country("SM","SAN MARINO","REP. OF SAN MARINO",CLCL,null,"47890","\\d{5}","378",false,1,null, null));
        list.put("ST", new Country("ST","SAO TOME AND PRINCIPE","SAO TOME AND PRINCIPE",CLCL,null,null,null,"239",false,0,null, null));
        list.put("SN", new Country("SN","SENEGAL","SENEGAL",CDFC,null,"12500","\\d{5}","221",false,0,null, null));
        list.put("RS", new Country("RS","SERBIA","REPUBLIC OF SERBIA",CLCL,null,"106314","\\d{6}","381",false,2,null, null));
        list.put("SC", new Country("SC","SEYCHELLES","SEYCHELLES",CLCL,null,null,null,"248",false,4,null, null));
        list.put("SL", new Country("SL","SIERRA LEONE","SIERRA LEONE",TOWN,null,null,null,"232",false,0,null, null));
        list.put("SG", new Country("SG","SINGAPORE","REP. OF SINGAPORE",TOWN,null,"546080","\\d{6}","65",false,8,null, null));
        list.put("SK", new Country("SK","SLOVAKIA","SLOVAKIA",CLCL,DOFC,"010 01","\\d{3} \\d{2}","421",false,1,null, null));
        list.put("SB", new Country("SB","SOLOMON ISLANDS","SOLOMON ISLANDS",CISL,null,null,null,"677",false,11,null, null));
        list.put("SO", new Country("SO","SOMALIA","SOMALIA",TOWN,REGN,"JH 09010","([A-Z]{02}[ ]\\d{5})","252",true,3, Locales.getSO(), null));
        list.put("ZA", new Country("ZA","SOUTH AFRICA","SOUTH AFRICA",SUBR,TWNS,"0083","\\d{4}","27",false,2,null, null));
        list.put("GS", new Country("GS","S GEORGIA AND S SANDWICH ISLANDS","SOUTH GEORGIA",CLCL,null,"SIQQ 1ZZ","SIQQ[ ]1ZZ",null,false,-2,null, null));
        list.put("ES", new Country("ES","SPAIN","SPAIN",TOWN,null,"28039","\\d{5}","34",false,1,null, null));
        list.put("LK", new Country("LK","SRI LANKA","SRI LANKA",CLCL,null,"20000","\\d{5}","94",false,5.5,null, null));
        list.put("SR", new Country("SR","SURINAME","SURINAME",CDSR,null,null,null,"597",true,-3, Locales.getSR(), null));
        list.put("SJ", new Country("SJ","SVALBARD AND JAN MAYEN","SVALBARD AND JAN MAYEN",CLCL,null,null,null,"47",false,1,null, null));
        list.put("SZ", new Country("SZ","SWAZILAND","SWAZILAND",CLCL,null,"H100","([A-Z]\\d{3})","268",false,2,null, null));
        list.put("SE", new Country("SE","SWEDEN","SWEDEN",CLCL,null,"114 55","\\d{3}[ ]\\d{2}","46",false,1,null, null));
        list.put("CH", new Country("CH","SWITZERLAND","SWITZERLAND",CLCL,CNTN,"2544","\\d{4}","41",false,1,null, null));
        list.put("SY", new Country("SY","SYRIAN ARAB REPUBLIC","SYRIAN ARAB REP.",CLCL,null,null,null,"963",false,2,null, null));
        list.put("TW", new Country("TW","TAIWAN, PROVINCE OF CHINA","TAIWAN (R. O. C.)",DTMC,CTCY,"102","\\d{3}([-]?\\d{2})?","886",false,8,null, null));
        list.put("TJ", new Country("TJ","TAJIKISTAN","TAJIKISTAN",CLCL,null,"735450","\\d{6}","992",false,6,null, null));
        list.put("TZ", new Country("TZ","TANZANIA, UNITED REPUBLIC OF","TANZANIA (UNITED REP.)",CLCL,null,null,null,"255",false,3,null, null));
        list.put("TL", new Country("TL","TIMOR-LESTE","TIMOR-LESTE",CLCL,null,null,null,"670",false,9,null, null));
        list.put("TG", new Country("TG","TOGO","TOGO",CLCL,null,null,null,"228",false,0,null, null));
        list.put("TK", new Country("TK","TOKELAU","TOKELAU",CATL,null,null,null,"690",false,13,null, null));
        list.put("TO", new Country("TO","TONGA","TONGA",CLCL,null,null,null,"676",false,13,null, null));
        list.put("TT", new Country("TT","TRINIDAD AND TOBAGO","TRINIDAD AND TOBAGO",CLCL,null,null,null,null,false,-4,null, null));
        list.put("AF", new Country("AF","AFGHANISTAN","AFGHANISTAN",CITY,STAT,null,null,"93",false,4.5,null, null));
        list.put("AX", new Country("AX","ALAND ISLANDS","FINLAND",TOWN,ISLD,"22100","\\d{5}","358",false,3,null, null));
        list.put("AL", new Country("AL","ALBANIA","ALBANIA",CITY,null,null,null,"355",false,1,null, null));
        list.put("DZ", new Country("DZ","ALGERIA","ALGERIA",CLCL,null,"16027","\\d{5}","213",false,1,null, null));
        list.put("AD", new Country("AD","ANDORRA","ANDORRA",CLCL,DLCL,"AD700","AD\\d{3}","376",false,1,null, null));
        list.put("AO", new Country("AO","ANGOLA","ANGOLA",CITY,null,null,null,"244",false,1,null, null));
        list.put("AI", new Country("AI","ANGUILLA","ANGUILLA",CDSR,null,null,null,null,false,-4,null, null));
        list.put("AQ", new Country("AQ","ANTARCTICA","ANTARCTICA",CITY,null,null,null,"672",false,12,null, null));
        list.put("AG", new Country("AG","ANTIGUA AND BARBUDA","ANTIGUA AND BARBUDA",CITY,null,null,null,null,false,-4,null, null));
        list.put("AM", new Country("AM","ARMENIA","ARMENIA",CLCL,null,"375010","\\d{6}","374",false,4,null, null));
        list.put("AW", new Country("AW","ARUBA","ARUBA",CLCL,null,null,null,"297",false,-4,null, null));
        list.put("AC", new Country("AC","ASCENSION","ASCENSION",TOWN,null,"ASCN 1ZZ","ASCN[ ]1ZZ","247",false,0,null, null));
        list.put("AU", new Country("AU","AUSTRALIA","AUSTRALIA",CITY,STAT,"2060","\\d{4}","61",true,10, Locales.getAU(), null));
        list.put("AT", new Country("AT","AUSTRIA","AUSTRIA",CLCL,null,"1010","\\d{4}","43",false,1,null, null));
        list.put("AZ", new Country("AZ","AZERBAIJAN","AZERBAIJAN",CLCL,null,"AZ 1000","AZ[ ]\\d{4}","994",false,3,null, null));
        list.put("BS", new Country("BS","BAHAMAS","BAHAMAS",TOWN,ISLD,null,null,null,false,-5,null, null));
        list.put("BH", new Country("BH","BAHRAIN","BAHRAIN",TOWN,STAT,"317","\\d{3}","973",false,3,null, null));
        list.put("BB", new Country("BB","BARBADOS","BARBADOS",TOWN,null,null,null,null,false,-4,null, null));
        list.put("BY", new Country("BY","BELARUS","BELARUS",CLCL,PROV,"220050","\\d{6}","375",false,2,null, null));
        list.put("BE", new Country("BE","BELGIUM","BELGIUM",CLCL,null,"4000","\\d{4}","32",false,1,null, null));
        list.put("BZ", new Country("BZ","BELIZE","BELIZE",CITY,null,null,null,"501",false,-6,null, null));
        list.put("BJ", new Country("BJ","BENIN","BENIN",CLCL,null,"12","\\d{2}","229",false,1,null, null));
        list.put("BM", new Country("BM","BERMUDA","BERMUDA",CPRH,null,"FL 07","[A-Z]{2}[ ]\\d{2}",null,false,-4,null, null));
        list.put("BT", new Country("BT","BHUTAN","BHUTAN",CLCL,null,null,null,"975",false,6,null, null));
        list.put("BO", new Country("BO","BOLIVIA","BOLIVIA",CLCL,null,null,null,"591",false,-4,null, null));
        list.put("BW", new Country("BW","BOTSWANA","BOTSWANA",CLCL,null,null,null,"267",false,2,null, null));
        list.put("BV", new Country("BV","BOUVET ISLAND","NORWAY",CLCL,null,null,null,"47",false,2,null, null));
        list.put("BR", new Country("BR","BRAZIL","BRAZIL",TOWN,STAT,"40301-110","\\d{5}-\\d{3}","55",true,-3, Locales.getBR(), null));
        list.put("BQ", new Country("BQ","BRITISH ANTARCTIC TERRITORY","BRITISH ANTARCTIC TERRITORY",DLVY,null,"BIQQ 1ZZ","BIQQ 1ZZ",null,false,12,null, null));
        list.put("IO", new Country("IO","BRITISH INDIAN OCEAN TERRITORY","BRITISH INDIAN OCEAN TERRITORY",DLVY,null,"BBND 1ZZ","BBND 1ZZ","246",false,5,null, null));
        list.put("BN", new Country("BN","BRUNEI DARUSSALAM","BRUNEI DARUSSALAM",VLGE,DSTR,"BT2328","[A-Z]{2}\\d{4}","673",false,8,null, null));
        list.put("BG", new Country("BG","BULGARIA","BULGARIA",CLCL,null,"1000","\\d{4}","359",false,2,null, null));
        list.put("BF", new Country("BF","BURKINA FASO","BURKINA FASO",TOWN,null,null,null,"226",false,0,null, null));
        list.put("BI", new Country("BI","BURUNDI","BURUNDI",CLCL,null,null,null,"257",false,2,null, null));
        list.put("KH", new Country("KH","CAMBODIA","CAMBODIA",CLCL,null,"12203","(\\d{5})?","855",false,7,null, null));
        list.put("CM", new Country("CM","CAMEROON","CAMEROON",CLCL,null,null,null,"237",false,1,null, null));
        list.put("CA", new Country("CA","CANADA","CANADA",CITY,PROV,"H3Z 2Y7","[A-Z]\\d[A-Z][ ]\\d[A-Z]\\d",null,true,-4, Locales.getCA(), null));
        list.put("CV", new Country("CV","CAPE VERDE","CAPE VERDE",CLCL,ISLD,"7600","\\d{4}","238",false,-1,null, null));
        list.put("KY", new Country("KY","CAYMAN ISLANDS","CAYMAN ISLANDS",CISL,null,null,null,null,false,-5,null, null));
        list.put("CF", new Country("CF","CENTRAL AFRICAN REPUBLIC","CENTRAL AFRICAN REP.",CLCL,null,null,null,"236",false,1,null, null));
        list.put("TD", new Country("TD","CHAD","CHAD",CLCL,null,null,null,"235",false,1,null, null));
        list.put("CL", new Country("CL","CHILE","CHILE",CCTY,null,"8340457","\\d{7}","56",false,-4,null, null));
        list.put("CN", new Country("CN","CHINA","P.R. CHINA",CITY,PROV,"266033","\\d{6}","86",false,8,null, null));
        list.put("CX", new Country("CX","CHRISTMAS ISLAND","AUSTRALIA",CITY,STAT,"2060","\\d{4}","61",true,-10, Locales.getCX(), null));
        list.put("CC", new Country("CC","COCOS (KEELING) ISLANDS","AUSTRALIA",CITY,STAT,"2060","\\d{4}","61",true,-10, Locales.getCC(), null));
        list.put("CO", new Country("CO","COLOMBIA","COLOMBIA",CITY,null,null,null,"57",false,-5,null, null));
        list.put("KM", new Country("KM","COMOROS","COMOROS",CLCL,null,null,null,"269",false,3,null, null));
        list.put("CG", new Country("CG","CONGO","CONGO",CLCL,null,null,null,"242",false,1,null, null));
        list.put("CD", new Country("CD","CONGO, DEMOCRATIC REPUBLIC OF","CONGO (REP.)",CLCL,null,null,null,"243",false,1,null, null));
        list.put("CK", new Country("CK","COOK ISLANDS","COOK ISLANDS",TOWN,null,"6001","\\d{4}","682",false,-10,null, null));
        list.put("CR", new Country("CR","COSTA RICA","COSTA RICA",CITY,null,"1000","\\d{4}","506",false,-6,null, null));
        list.put("CI", new Country("CI","COTE D'IVOIRE","COTE D'IVOIRE (REP.)",CLCL,null,"17","(\\d{2,3})?","225",false,0,null, null));
        list.put("HR", new Country("HR","CROATIA","CROATIA",CLCL,null,"10000","\\d{5}","385",false,1,null, null));
        list.put("CU", new Country("CU","CUBA","CUBA",PZNE,null,"10600","\\d{5}","53",false,-5,null, null));
        list.put("CY", new Country("CY","CYPRUS","CYPRUS",CLCL,null,"2008","\\d{4}","357",false,2,null, null));
        list.put("CZ", new Country("CZ","CZECH REPUBLIC","CZECH REP.",DLCT,LOCL,"100 00","\\d{3}[ ]\\d{2}","420",false,2,null, null));
        list.put("DK", new Country("DK","DENMARK","DENMARK",TOWN,DSTR,"8660","\\d{4}","45",false,1,null, null));
        list.put("DJ", new Country("DJ","DJIBOUTI","DJIBOUTI",CLCL,null,null,null,"253",false,3,null, null));
        list.put("DM", new Country("DM","DOMINICA","DOMINICA",CLCL,null,null,null,null,false,-4,null, null));
        list.put("DO", new Country("DO","DOMINICAN REPUBLIC","DOMINICAN REP.",CDSR,LOCL,"11903","(\\d{5})?",null,false,-4,null, null));
        list.put("EC", new Country("EC","ECUADOR","ECUADOR",CLCL,null,"H0103C","[A-Z]\\d{4}[A-Z]","593",false,-5,null, null));
        list.put("EG", new Country("EG","EGYPT","EGYPT",CDSR,GVRT,"12411","\\d{5}","20",false,2,null, null));
        list.put("SV", new Country("SV","EL SALVADOR","EL SALVADOR",CLCL,DEPT,"1120","\\d{4}","503",false,-6,null, null));
        list.put("GQ", new Country("GQ","EQUATORIAL GUINEA","EQUATORIAL GUINEA",CLCL,null,null,null,"240",false,1,null, null));
        list.put("ER", new Country("ER","ERITREA","ERITREA",CLCL,null,null,null,"291",false,3,null, null));
        list.put("EE", new Country("EE","ESTONIA","ESTONIA",CLCL,null,"69501","\\d{5}","372",false,2,null, null));
        list.put("ET", new Country("ET","ETHIOPIA","ETHIOPIA",CLCL,null,"1000","\\d{4}","251",false,3,null, null));
        list.put("FK", new Country("FK","FALKLAND ISLANDS (MALVINAS)","FALKLAND (MALVINAS)",CLCL,null,"FIQQ 1ZZ","FIQQ 1ZZ","500",false,-4,null, null));
        list.put("FO", new Country("FO","FAROE ISLANDS","FAROE",CLCL,null,"FO100","FO\\d{3}","298",false,0,null, null));
        list.put("FJ", new Country("FJ","FIJI","FIJI",TOWN,null,null,null,"679",false,12,null, null));
        list.put("FI", new Country("FI","FINLAND","FINLAND",CLCL,null,"00550","\\d{5}","358",false,2,null, null));
        list.put("FR", new Country("FR","FRANCE","FRANCE",CITY,LCD,"33380","\\d{5}","33",false,1,null, null));
        list.put("GF", new Country("GF","FRENCH GUIANA","FRANCE",CITY,LCD,"97300","(97|98)3\\d{2}","594",false,-3,null, null));
        list.put("PF", new Country("PF","FRENCH POLYNESIA","FRENCH POLYNESIA",CLCL,MNIL,"98709","(97|98)7\\d{2}","689",false,-10,null, null));
        list.put("GA", new Country("GA","GABON","GABON",CLCL,null,"01",".*","241",false,1,null, null));
        list.put("GM", new Country("GM","GAMBIA","GAMBIA",CLCL,null,null,null,"220",false,0,null, null));
        list.put("GE", new Country("GE","GEORGIA","GEORGIA",CLCL,null,"0100","\\d{4}","995",false,4,null, null));
        list.put("DE", new Country("DE","GERMANY","GERMANY",CLCL,null,"26133","\\d{5}","49",false,1,null, null));
        list.put("GH", new Country("GH","GHANA","GHANA",CLCL,null,null,null,"233",false,0,null, null));
        list.put("GI", new Country("GI","GIBRALTAR","GIBRALTAR",DLVY,null,null,null,"350",false,1,null, null));
        list.put("GR", new Country("GR","GREECE","GREECE",CLCL,null,"151 24","\\d{3}[ ]\\d{2}","30",false,2,null, null));
        list.put("GL", new Country("GL","GREENLAND","GREENLAND",TOWN,DSTR,"8660","\\d{4}","299",false,-3,null, null));
        list.put("GD", new Country("GD","GRENADA","GRENADA (WEST INDIES)",MUNI,null,null,null,null,false,-4,null, null));
        list.put("GP", new Country("GP","GUADELOUPE","FRANCE",CITY,LCD,"97100","(97|98)(1|0)\\d{2}","590",false,-4,null, null));
        list.put("GT", new Country("GT","GUATEMALA","GUATEMALA",CDPT,null,"09001","\\d{5}","502",false,-6,null, null));
        list.put("GN", new Country("GN","GUINEA","GUINEA",CLCL,null,"001","\\d{3}","224",false,0,null, null));
        list.put("GW", new Country("GW","GUINEA-BISSAU","GUINEA-BISSAU",CLCL,null,"1000","\\d{4}","245",false,0,null, null));
        list.put("GY", new Country("GY","GUYANA","GUYANA",TOWN,null,null,null,"592",false,-3,null, null));
        list.put("HT", new Country("HT","HAITI","HAITI",CLCL,null,"HT6120","HT\\d{4}","509",false,-5,null, null));
        list.put("HM", new Country("HM","HEARD ISLAND AND MCDONALD ISLANDS","AUSTRALIA",CLCL,null,null,null,"61",false,5,null, null));
        list.put("VA", new Country("VA","HOLY SEE (VATICAN CITY STAT)","VATICAN",CLCL,null,"00120","\\d{5}","39",false,1,null, null));
        list.put("HN", new Country("HN","HONDURAS","HONDURAS",CLCL,DEPT,"CM1102","[A-Z]{2}\\d{4}","504",true,-6, Locales.getHN(), null));
        list.put("HK", new Country("HK","HONG KONG","HONGKONG",CDSR,null,null,null,"852",false,8,null, null));
        list.put("HU", new Country("HU","HUNGARY","HUNGARY (REP.)",CLCL,null,"1037","\\d{4}","36",false,1,null, null));
        list.put("IS", new Country("IS","ICELAND","ICELAND",CLCL,null,"220","\\d{3}","354",false,0,null, null));
        list.put("IN", new Country("IN","INDIA","INDIA",TOWN,null,"110034","\\d{6}","91",false,5.5,null, null));
        list.put("ID", new Country("ID","INDONESIA","INDONESIA",CLCL,null,"40115","\\d{5}","62",false,7,null, null));
        list.put("IQ", new Country("IQ","IRAQ","IRAQ",CLCL,PROV,"61002","\\d{5}","964",true,3, Locales.getIQ(), null));
        list.put("IE", new Country("IE","IRELAND","IRELAND",TOWN,CNTY,"12",".*","353",false,0,null, null));
        list.put("IM", new Country("IM","ISLE OF MAN","ISLE OF MAN",TOWN,null,"IM2 1AA","(([A-Z]{1,2})([0-9]{1,2}[A-Z]?[ ])(\\d[A-Z]{2}))|GIR[ ]0AA","44",false,1,null, null));
        list.put("IL", new Country("IL","ISRAEL","ISRAEL",CLCL,null,"94142","\\d{5}","972",false,2,null, null));
        list.put("IT", new Country("IT","ITALY","ITALY",CLCL,PROV,"00144","\\d{5}","39",true,1, Locales.getIT(), null));
        list.put("JM", new Country("JM","JAMAICA","JAMAICA",TOWN,PRSH,"10",".*",null,true,-5, Locales.getJM(), null));
        list.put("JP", new Country("JP","JAPAN","JAPAN",CLCL,null,"951-8073","\\d{3}-\\d{4}","81",false,9,null, null));
        list.put("JE", new Country("JE","JERSEY","UNITED KINGDOM",TOWN,CNTY,"JE1 1AA","(([A-Z]{1,2})([0-9]{1,2}[A-Z]?[ ])(\\d[A-Z]{2}))|GIR[ ]0AA","44",false,1,null, null));
        list.put("JO", new Country("JO","JORDAN","JORDAN",CLCL,null,"11937","\\d{5}","962",false,2,null, null));
        list.put("KZ", new Country("KZ","KAZAKHSTAN","KAZAKHSTAN",LCDS,PROV,"040900","\\d{6}","7",false,6,null, null));
        list.put("KI", new Country("KI","KIRIBATI","KIRIBATI",TOWN,ISLD,null,null,"686",false,12,null, null));
        list.put("KP", new Country("KP","KOREA, DEMOCRATIC PEOPLE'S REPUBLIC OF","DEM. PEOPLE'S REP. OF KOREA",CLCL,null,null,null,"82",false,9,null, null));
        list.put("KR", new Country("KR","KOREA, REPUBLIC OF","KOREA (REP.)",CLCL,PROV,"110-110","\\d{3}-\\d{3}","850",false,9,null, null));
        list.put("CS", new Country("CS","KOSOVO","KOSOVO (UNMIK)",CLCL,null,"10000","\\d{5}","381",false,4,null, null));
        list.put("KW", new Country("KW","KUWAIT","KUWAIT",TOWN,null,"54551","\\d{5}","965",false,3,null, null));
        list.put("KG", new Country("KG","KYRGYZSTAN","KYRGYSTAN",CLCL,null,"720001","\\d{6}","996",false,5,null, null));
        list.put("LV", new Country("LV","LATVIA","LATVIA",CLCL,null,"1073","\\d{4}","371",false,2,null, null));
        list.put("LB", new Country("LB","LEBANON","LEBANON",CLCL,null,"2038 3054","\\d{4}([ ]\\d{4})?","961",false,2,null, null));
        list.put("LS", new Country("LS","LESOTHO","LESOTHO",CLCL,null,"100","\\d{3}","266",false,2,null, null));
        list.put("LR", new Country("LR","LIBERIA","LIBERIA",CLCL,null,"1000","\\d{4}","231",false,0,null, null));
        list.put("LY", new Country("LY","LIBYAN ARAB JAMAHIRIYA","LIBRAN JAMAHIRIYA",CLCL,null,null,null,"218",false,2,null, null));
        list.put("LI", new Country("LI","LIECHTENSTEIN","LIECHTENSTEIN",CLCL,CNTN,"2544","\\d{4}","423",false,2,null, null));
        list.put("LT", new Country("LT","LITHUANIA","LITHUANIA",CITY,null,"04340","\\d{5}","370",false,2,null, null));
        list.put("MO", new Country("MO","MACAO","MACAO",TOWN,null,null,null,"853",false,8,null, null));
        list.put("MK", new Country("MK","MACEDONIA, FRMR YUGOSLAV REPB OF","THE FRMR YUGOSLAV REPB OF MACEDONIA",CLCL,null,"1000","\\d{4}","389",false,1,null, null));
        list.put("MG", new Country("MG","MADAGASCAR","MADAGASCAR",TOWN,null,"501","\\d{3}","261",false,3,null, null));
        list.put("MW", new Country("MW","MALAWI","MALAWI",CLCL,null,null,null,"265",false,2,null, null));
        list.put("MY", new Country("MY","MALAYSIA","MALAYSIA",CLCL,STAT,"43000","\\d{5}","60",false,8,null, null));
        list.put("MV", new Country("MV","MALDIVES","MALDIVES",CATL,null,"20026","\\d{5}","960",false,5,null, null));
        list.put("ML", new Country("ML","MALI","MALI",CLCL,null,null,null,"223",false,0,null, null));
        list.put("MT", new Country("MT","MALTA","MALTA",CDSR,LOCL,"NXR 01","[A-Z]{3}[ ]\\d{2,4}","356",false,1,null, null));
        list.put("MQ", new Country("MQ","MARTINIQUE","FRANCE",CITY,null,"97220","(97|98)2\\d{2}","596",false,-4,null, null));
        list.put("MR", new Country("MR","MAURITANIA","MAURITANIA",CLCL,null,null,null,"222",false,0,null, null));
        list.put("MU", new Country("MU","MAURITIUS","MAURITIUS",CLCL,null,"742CU001",".*","230",false,4,null, null));
        list.put("YT", new Country("YT","MAYOTTE","FRANCE",CITY,null,"97600","(97|98)6\\d{2}","269",false,3,null, null));
        list.put("MX", new Country("MX","MEXICO","MEXICO",CLCL,PROV,"02860","\\d{5}","52",true,-6, Locales.getMX(), null));
        list.put("MD", new Country("MD","MOLDOVA, REPUBLIC OF","REPUBLIC OF MOLDOVA",CLCL,null,"2012","\\d{4}","373",false,2,null, null));
        list.put("MC", new Country("MC","MONACO","MONACO",CLCL,null,"98000","\\d{5}","377",false,1,null, null));
        list.put("MN", new Country("MN","MONGOLIA","MONGOLIA",CLCL,null,"210152","\\d{6}","976",false,8,null, null));
        list.put("ME", new Country("ME","MONTENEGRO","MONTENEGRO",CLCL,null,"81000","\\d{5}","382",false,1,null, null));
        list.put("MS", new Country("MS","MONTSERRAT","MONTSERRAT",TOWN,CNTY,null,null,null,false,-4,null, null));
        list.put("MA", new Country("MA","MOROCCO","MOROCCO",CLCL,null,"53000","\\d{5}","212",false,0,null, null));
        list.put("MZ", new Country("MZ","MOZAMBIQUE","MOZAMBIQUE",CLCL,PROV,"1100","\\d{4}","258",false,2,null, null));
        list.put("MM", new Country("MM","MYANMAR","MYANMAR",TOWN,null,"11181","\\d{5}","95",false,6.5,null, null));
        list.put("NA", new Country("NA","NAMIBIA","NAMIBIA",CLCL,null,null,null,"264",false,1,null, null));
        list.put("NR", new Country("NR","NAURU","NAURU CENTRAL PACIFIC",CDSR,null,null,null,"674",false,12,null, null));
        list.put("NP", new Country("NP","NEPAL","NEPAL",CLCL,null,"44601","\\d{5}","977",false,5.75,null, null));
        list.put("NL", new Country("NL","NETHERLANDS","NETHERLANDS",CLCL,null,"1234 AB","\\d{4}[ ][A-Z]{2}","31",false,1,null, null));
        list.put("AN", new Country("AN","NETHERLANDS ANTILLES","NETHERLANDS ANTILLES",CLCL,null,null,null,"599",false,-4,null, null));
        list.put("NC", new Country("NC","NEW CALEDONIA","NEW CALEDONIA",CITY,LCD,"98814","(97|98)8\\d{2}","687",false,11,null, null));
        list.put("NZ", new Country("NZ","NEW ZEALAND","NEW ZEALAND",TOWN,null,"6001","\\d{4}","64",false,12,null, null));
        list.put("NI", new Country("NI","NICARAGUA","NICARAGUA",MUNI,DEPT,"050-005-4","\\d{3}-\\d{3}-\\d","505",false,-6,null, null));
        list.put("NE", new Country("NE","NIGER","NIGER",CLCL,null,"8001","\\d{4}","227",false,1,null, null));
        list.put("NG", new Country("NG","NIGERIA","NIGERIA",CLCL,STAT,"930283","\\d{6}","234",false,1,null, null));

        return Collections.unmodifiableMap(list);
    }

    public static Countries getInstance() {
        if (instance != null)
            return instance;
        synchronized(Countries.class){
            if (instance == null) {
                LIST = initializeMap();
                instance = new Countries();
            }
        }
        return instance;
    }

    public Map<String, String> getCountryCodeMap() {
        Map<String, String> list = new TreeMap<String, String>();
        for (Country c : LIST.values()) {
            list.put(c.getCode(), c.getName());

        }
        return list;
    }

    public Country get(String code) {
        return LIST.get(code);
    }

    /**
    * Provide the existing country phone prefixes
    * and return them as an ordered Map, ordered by phone prefix. Since
    * multiple countries share the same prefix, we concatenate the country
    * names together separated by a semi-colon.
    * @return map of prefix and country name(s).
    */
    public Map<String, Set<Country>> getPhonePrefixes() {
        // TODO
        return null;
    }

    /**
     * Provide the existing country phone prefixes as a list of OptionItem
     * elements containing the phone prefix and country names.
     * @return List of OptionItem elements.
     */
    public static List<OptionItem> getCPhonePrefixOptions() {
        // TODO
        return null;
    }
}
