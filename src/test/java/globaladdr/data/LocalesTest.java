package globaladdr.data;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class LocalesTest {
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
        Country c = Countries.getInstance().get("US");
        System.out.println(c.getLocales().getLocales(LocaleLabel.TERR));
    }
}
