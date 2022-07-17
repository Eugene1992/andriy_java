package homeworks.map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class MyHashMapTest {

    Map<Integer, String> map = new HashMap<>();

    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    @Test
    void size() {
        Assertions.assertEquals(0, map.size(), "Size should be equal to default value");
    }

    @Test
    void isEmpty() {
        Assertions.assertTrue(map.isEmpty(), "Shouldn't be empty");
    }

    @Test
    void containsKey() {
        map.put(1, "value");
        Assertions.assertTrue(map.containsKey(1));
        Assertions.assertFalse(map.containsKey(5));
    }

    @Test
    void containsValue() {
        map.put(1, "opa");
        Assertions.assertEquals("opa", map.get(1));

    }

    @Test
    void get() {
        map.put(1, "test");
        String testMy = map.get(1);
        Assertions.assertSame("test", testMy);
    }

    @Test
    void put() {
        map.put(0, "1");
        String testMy = map.get(0);
        Assertions.assertEquals("1", testMy);
    }

    @Test
    void remove() {
        map.put(0, "1");
        map.remove(0, "1");
        Assertions.assertEquals(null, map.get(0));
    }

    @Test
    void putAll() {
        map.put(1, "1");
        map.put(2, "2");
        map.put(3, "3");

        Map<Integer, String> joinMap = new HashMap<>();
        joinMap.put(4, "4");
        joinMap.put(5, "5");
        joinMap.put(6, "6");
        map.putAll(joinMap);

        int[] expected = {1, 2, 3, 4, 5, 6};

        for (int elem : expected) {
            Assertions.assertTrue(map.containsKey(elem));
            Assertions.assertTrue(map.containsValue(String.valueOf(elem)));
        }
    }

    @Test
    void clear() {
        map.put(5, "testOpaF5");
        map.put(6, "testOpa");
        map.clear();
        Assertions.assertEquals(0, map.size(), "Size should be equal to default value");
        Assertions.assertTrue(map.isEmpty(), "Shouldn't be empty");
    }

    @Test
    void keySet() {
        map.put(1, "testOpaF5");
        map.put(2, "testOpa");
        map.put(3, "test");
        int[] expected = {1, 2, 3};

        for (int elem : expected) {
            Assertions.assertTrue(map.containsKey(elem));
        }
    }

    @Test
    void values() {
        map.put(1, "testOpaF5");
        map.put(2, "testOpa");
        map.put(3, "test");

        for (String elem : map.values()) {
            Assertions.assertTrue(map.containsValue((elem)));
        }
    }

    @Test
    void entrySet() {
        map.put(1, "1");
        map.put(2, "2");
        map.put(3, "3");
        int[] expected = {1, 2, 3};

        for (int elem : expected) {
            Assertions.assertTrue(map.containsKey(elem));
            Assertions.assertTrue(map.containsValue(String.valueOf(elem)));
        }
    }
}