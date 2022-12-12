package DZ5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PopularList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        Map<String, Integer> people = new HashMap<>();

        list.add("Катя");
        list.add("Иван");
        list.add("Артем");
        list.add("Лиза");
        list.add("Иван");
        list.add("Лиза");
        list.add("Иван");
        list.add("Лиза");
        list.add("Артем");
        list.add("Иван");
        Set<String> unique = new HashSet<String>(list);
        for (String key : unique) {
            people.put(key, Collections.frequency(list, key));

        }
        System.out.println(sort(people));
    }

    public static <K, V extends Comparable<V>> Map<K, V> sort(final Map<K, V> map) {
        Comparator<K> value = new Comparator<K>() {
            public int compare(K k1, K k2) {
                int compare = map.get(k2).compareTo(map.get(k1));
                if (compare == 0)
                    return 1;
                else
                    return compare;
            }
        };
        Map<K, V> sort2 = new TreeMap<K, V>(value);
        sort2.putAll(map);
        return sort2;
    }
}


