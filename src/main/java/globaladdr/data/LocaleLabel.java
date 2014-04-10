package globaladdr.data;

public enum LocaleLabel {
    MLRY("Milatary"),
    LOCL("Locality"),
    STAT("State"),
    EMRT("Emirates"),
    PROV("Province"),
    TERR("Territory"),
    DEPT("Department"),
    DOFC("Delivery Office"),
    ISLD("Island"),
    PRSH("Parish"),
    REGN("Region"),
    DSTR("District"),
    ATOL("Atoll"),
    CNCL("Council"),
    CNTN("Canton"),
    CNTY("County"),
    GVRT("Governorate"),
    MNIL("Municipality/Isle"),
    DLCL("Destination Locality"),
    CTCY("City/County"),
    LCD("Locality/CEDEX Offc"),
    TWNS("Township");

    public String description;

    LocaleLabel(String desc) {
        this.description = desc;
    }
}
