package globaladdr;

/**
 * Any class that wants to be able to use the Demographics Formatter must
 * implement this interface. If name suffix is required, then also implement
 * {@link AddressExtrasI}.
 *
 * @author David Thompson
 */
public interface AddressI {
	/**
	 * @return the addresse's first name
	 */
    String getFirstName();

    /**
     * @return the addresse's middle initial
     */
    String getMi();

    /**
     * @return the addresse's last name
     */
    String getLastName();

    /**
     * @return address line 1
     */
    String getAddr1();

    /**
     * @return address line 2
     */
    String getAddr2();

    /**
     * @return address line 3
     */
    String getAddr3();

    /**
     * @return the city
     */
    String getCity();
    
    /**
     * @return the postal code 
     */
    String getPostalCode();

    /**
     * @return the two character country code
     */
    String getCountryCode();

    /**
     * @return the localeCode (State in US)
     */
    String getLocaleCode();

    /**
     * @return the localeName (a named region within a country)
     */
    String getLocaleName();
}
