package examples.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import examples.object_methods.Cat;
import examples.object_methods.Home;

public class HashMapTest {
    public static void main(String[] args) {
        Map<Cat, String> catsToCountryMap = new HashMap<>();
        Home home = new Home();

        Cat catOne = new Cat("Fix", 2, true, home);
        Cat catTwo = new Cat("Murka", 3, true, home);
        Cat catThree = new Cat("Tom", 5, false, home);

        catsToCountryMap.put(catOne, "Ukraine");
        catsToCountryMap.put(catTwo, "Spain");
        catsToCountryMap.put(catThree, "USA");

        Set<Map.Entry<Cat, String>> entries = catsToCountryMap.entrySet();
        Set<Cat> cats = catsToCountryMap.keySet();
        Collection<String> values = catsToCountryMap.values();

        for (Map.Entry<Cat, String> entry : entries) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
