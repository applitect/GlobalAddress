package globaladdr.data;

import java.util.TimeZone;

/**
 * A location ties area codes, postal codes, time zones, and locales together to provide information
 * about a specific location. As an interface this provides creating independent data sources 
 * for specific countries. For example there are zip5 databases that can be purchased for locations
 * in the US.
 *
 * @author David Thompson
 */
public interface LocationI {
    /**
     * @return the country of the location
     */
    Country getCountry();
    /**
     * @return the locale code (state code in the US, province code in Canada, etc.) for the location
     */
    String getLocaleCode();
    /**
     * @return the locale name such as county name, etc. in countries where a code is not used
     */
    String getLocaleName();
    /**
     * @return the phone number area code for the location, country prefix can be fetched from the Country.
     */
    String getAreaCode();
    /**
     * @return the postal code for the location
     */
    String getPostalCode();
    /**
     * @return the time zone for the location if available
     */
    TimeZone getTimeZone();
}
