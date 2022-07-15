package homeworks.map;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        HashMap<String,Integer> passportsAndNames = new HashMap<>();
        Object key = 1;
        passportsAndNames.put("lol", 1);
        passportsAndNames.put("lols", 2);
        passportsAndNames.put("lolr", 3);
        passportsAndNames.put("lolh", 4);
        System.out.println(Math.abs(key.hashCode()));
    }
}
