package globaladdr.data;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class CountriesTest {
    @Test
    public void testCountryMap() {
        Map<String,String> list = Countries.getInstance().getCountryCodeMap();
        Set<Entry<String, String>> a = list.entrySet();
        for (Entry<String, String> option : a) {
            System.out.println(option.getKey() + " : " + option.getValue());
        }
    }

    @Test
    public void testCountryLookup() {
        Country c = Countries.getInstance().get("NZ");
        System.out.println(c);
    }
}
