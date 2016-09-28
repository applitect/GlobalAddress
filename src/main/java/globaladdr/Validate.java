package globaladdr;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import globaladdr.data.Countries;
import globaladdr.data.Country;

public class Validate {
    // TODO: DEFAULT_COUNTRY should be externalized so it can be set within a manifest or config.
    private final static String DEFAULT_COUNTRY = "US";

    public static void validateAddress(AddressI addr)
      throws ValidationException {
        // TODO: Add field level validation

        // if no country code, assume US.
        String countryCode = Optional.ofNullable(addr.getCountryCode()).orElse(DEFAULT_COUNTRY);
        Country c = Countries.getInstance().get(countryCode);

        if (c.hasLocales()) {
            if (addr.getLocaleCode() == null)
                throw new ValidationException("missing.localeCode");

            if (! c.getLocales().contains(addr.getLocaleCode()))
                throw new ValidationException("invalid.localeCode");
        } else if (! c.isLocaleUsed()) {
            if (addr.getLocaleName() != null &&
                addr.getLocaleName().trim().length() > 0)
                throw new ValidationException("missing.localName");
        }

        if (c.isPostalCodeUsed() && c.getPostalCodeValidation() != null &&
                c.getPostalCodeValidation().length() > 0) {
            Pattern p = Pattern.compile(c.getPostalCodeValidation());
            Matcher m = p.matcher(addr.getPostalCode());
            if (!m.matches())
                throw new ValidationException("invalid.postalCode");
        }
    }

    public static void validateAddressExtras(AddressExtrasI addr)
              throws ValidationException {
    }

}
