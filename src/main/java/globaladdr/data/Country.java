package globaladdr.data;

public class Country {

    private String code;
    private String name;
    private String printName;
    private CityLabel cityLabel;
    private LocaleLabel localeLabel;
    private String samplePostalCode;
    private String postalCodeValidation;
    private String phonePrefix;
    private boolean hasLocales;
    private double capitalGMTOffset;
    private Locales locales;
    private PrintLayout printLayout;

    public Country(String code, String name, String printName, CityLabel cityLabel,
            LocaleLabel localeLabel, String samplePostalCode, String postalCodeValidation,
            String phonePrefix, boolean hasLocales, double capitalGMTOffset,
            Locales locales, PrintLayout printLayout) {
        this.code = code;
        this.name = name;
        this.printName = printName;
        this.cityLabel = cityLabel;
        this.localeLabel = localeLabel;
        this.samplePostalCode = samplePostalCode;
        this.postalCodeValidation = postalCodeValidation;
        this.phonePrefix = phonePrefix;
        this.hasLocales = hasLocales;
        this.capitalGMTOffset = capitalGMTOffset;
        this.locales = locales;
        this.printLayout = printLayout;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrintName() {
        return printName;
    }

    public void setPrintName(String printName) {
        this.printName = printName;
    }

    public CityLabel getCityLabel() {
        return cityLabel;
    }

    public void setCityLabel(CityLabel cityLabel) {
        this.cityLabel = cityLabel;
    }

    public LocaleLabel getLocaleLabel() {
        return localeLabel;
    }

    public void setLocaleLabel(LocaleLabel localeLabel) {
        this.localeLabel = localeLabel;
    }

    public String getSamplePostalCode() {
        return samplePostalCode;
    }

    public void setSamplePostalCode(String samplePostalCode) {
        this.samplePostalCode = samplePostalCode;
    }

    public String getPostalCodeValidation() {
        return postalCodeValidation;
    }

    public void setPostalCodeValidation(String postalCodeValidation) {
        this.postalCodeValidation = postalCodeValidation;
    }

    public String getPhonePrefix() {
        return phonePrefix;
    }

    public void setPhonePrefix(String phonePrefix) {
        this.phonePrefix = phonePrefix;
    }

    public boolean isHasLocales() {
        return hasLocales;
    }

    public void setHasLocales(boolean hasLocales) {
        this.hasLocales = hasLocales;
    }

    public double getCapitalGMTOffset() {
        return capitalGMTOffset;
    }

    public void setCapitalGMTOffset(double capitalGMTOffset) {
        this.capitalGMTOffset = capitalGMTOffset;
    }

    public Locales getLocales() {
        return locales;
    }

    public void setLocales(Locales locales) {
        this.locales = locales;
    }

    public PrintLayout getPrintLayout() {
        return printLayout;
    }

    public void setPrintLayout(PrintLayout printLayout) {
        this.printLayout = printLayout;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Country [code=").append(code).append(", name=").append(name)
                .append(", printName=").append(printName).append(", cityLabel=").append(cityLabel)
                .append(", localeLabel=").append(localeLabel).append(", samplePostalCode=")
                .append(samplePostalCode).append(", postalCodeValidation=")
                .append(postalCodeValidation).append(", phonePrefix=").append(phonePrefix)
                .append(", hasLocales=").append(hasLocales).append(", capitalGMTOffset=")
                .append(capitalGMTOffset).append(", locales=").append(locales)
                .append(", printLayout=").append(printLayout).append("]");
        return builder.toString();
    }
}
