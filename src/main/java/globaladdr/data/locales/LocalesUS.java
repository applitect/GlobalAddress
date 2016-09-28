package globaladdr.data.locales;

import static globaladdr.data.LocaleLabel.MLRY;
import static globaladdr.data.LocaleLabel.STAT;
import static globaladdr.data.LocaleLabel.TERR;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

import globaladdr.data.Locale;
import globaladdr.data.Locales;

public class LocalesUS extends Locales {
    static {
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
        locales = Collections.unmodifiableMap(loc);
    }
}
