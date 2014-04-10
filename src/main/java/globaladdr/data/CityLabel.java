package globaladdr.data;

public enum CityLabel {
    DTMC("Dist/Townshp/Sm City"),
    CITY("City"),
    CLCL("Locality"),
    TOWN("Town"),
    DLVY("Delivery Point"),
    VLGE("Village"),
    CISL("Island"),
    CCTY("County"),
    PZNE("Postal Zone"),
    DLCT("Delivery City"),
    CDFC("Delivery Office"),
    MUNI("Municipality"),
    LCDS("Locality/District"),
    CATL("Atoll"),
    PTWN("Post Town"),
    TDST("Town/District"),
    PRFR("Prefecture"),
    QUAR("Quartier"),
    CDSR("District"),
    CNCL("Council"),
    CPRH("Parish"),
    CDPT("Department"),
    CPRV("Province"),
    SUBR("Suburb"),
    CEMT("Emirate");

    public String description;

    CityLabel(String desc) {
        this.description = desc;
    }
}
