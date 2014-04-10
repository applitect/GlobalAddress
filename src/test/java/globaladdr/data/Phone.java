package globaladdr.data;

import globaladdr.PhoneI;

public class Phone implements PhoneI {

    public String phoneType;
    public String phoneArea;
    public String phoneLocal;
    public String phoneExt;
    public String phoneCountryPfx;

    public String getPhoneType() {
        return phoneType;
    }
    public String getPhoneArea() {
        return phoneArea;
    }
    public String getPhoneLocal() {
        return phoneLocal;
    }
    public String getPhoneExt() {
        return phoneExt;
    }
    public String getPhoneCountryPfx() {
        return phoneCountryPfx;
    }
}
