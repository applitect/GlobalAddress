package globaladdr;

/**
 * If you require your address to handle name suffixes, implement this
 * interface.
 *
 * @author David Thompson
 *
 */
public interface AddressExtrasI {
	/**
	 * @return an addresse's salutation such as Mr., Mrs., Dr.
	 */
    public String getSalutation();
    
    /**
     * @return an addresse's name suffix such as Jr., Sr., III, Ph.D.
     */
    public String getNameSuffix();
}
