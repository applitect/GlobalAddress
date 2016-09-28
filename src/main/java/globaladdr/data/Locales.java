package globaladdr.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 * The sets of locales for countries.
 *
 * @author dthompson
 */
public abstract class Locales {
    protected static Map<String, Locale> locales;

    public Map<String, String> getLocales() {
        Map<String, String> list = new TreeMap<String, String>();
        for (Locale l : locales.values()) {
            list.put(l.getCode(), l.getName());
        }
        return Collections.unmodifiableMap(list);
    }

    public Map<String, String> getLocales(LocaleLabel type) {
        Map<String, String> list = new TreeMap<String, String>();
        for (Locale l : locales.values()) {
            if (l.getType() == type)
                list.put(l.getCode(), l.getName());
        }
        return Collections.unmodifiableMap(list);
    }

    public Map<String, String> getLocales(Set<LocaleLabel> types) {
        Map<String, String> list = new TreeMap<String, String>();
        for (Locale l : locales.values()) {
            if (types.contains(l.getType()))
                list.put(l.getCode(), l.getName());
        }
        return Collections.unmodifiableMap(list);
    }

    public List<OptionItem> getLocalesList() {
        List<OptionItem> list = new ArrayList<OptionItem>();
        for (Locale l : locales.values()) {
            list.add(new OptionItem(l.getCode(), l.getName()));
        }
        return Collections.unmodifiableList(list);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Locales [locales=").append(locales);
        for (Entry<String, Locale> l : locales.entrySet()) {
            builder.append(l.getKey() + " : " + l.getValue());
        }
        builder.append("]");
        return builder.toString();
    }
}
