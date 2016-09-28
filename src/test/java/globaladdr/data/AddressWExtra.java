package globaladdr.data;

import globaladdr.AddressExtrasI;
import globaladdr.AddressI;

public class AddressWExtra implements AddressI, AddressExtrasI {
    public String firstName;
    public String mi;
    public String lastName;
    public String addr1;
    public String addr2;
    public String addr3;
    public String unitType;
    public String unitNumber;
    public String city;
    public String postalCode;
    public String countryCode;
    public String localeName;
    public String localeCode;
    public String nameSuffix;
    public String salutation;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getMi() {
        return mi;
    }
    public void setMi(String mi) {
        this.mi = mi;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getAddr1() {
        return addr1;
    }
    public void setAddr1(String addr1) {
        this.addr1 = addr1;
    }
    public String getAddr2() {
        return addr2;
    }
    public void setAddr2(String addr2) {
        this.addr2 = addr2;
    }
    public String getAddr3() {
        return addr3;
    }
    public void setAddr3(String addr3) {
        this.addr3 = addr3;
    }
    public String getUnitType() {
        return this.unitType;
    }
    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }
    public String getUnitNumber() {
        return this.unitNumber;
    }
    public void setUnitNumber(String unitNumber) {
        this.unitNumber = unitNumber;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getPostalCode() {
        return postalCode;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public String getCountryCode() {
        return countryCode;
    }
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
    public String getLocaleName() {
        return localeName;
    }
    public void setLocaleName(String localeName) {
        this.localeName = localeName;
    }
    public String getLocaleCode() {
        return localeCode;
    }
    public void setLocaleCode(String localeCode) {
        this.localeCode = localeCode;
    }
    public String getNameSuffix() {
        return nameSuffix;
    }
    public void setNameSuffix(String nameSuffix) {
        this.nameSuffix = nameSuffix;
    }
    public String getSalutation() {
        return salutation;
    }
    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }
}
