package homeworks.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyListTest {

    private static final int DEFAULT_SIZE = 20;
    private MyList<String> myList;

    @BeforeEach
    public void setUp() {//linked
        this.myList = new MyLinkedList<>();
        for (int i = 0; i < DEFAULT_SIZE; i++) {
            myList.add(String.valueOf(i));
        }
    }

    @Test
    void add() {
        myList.add("1");
        String testMy = myList.get(1);
        Assertions.assertEquals("1", testMy);
    }

    @Test
    void testAdd() {
        myList.add(1, "1");
        String testMy = myList.get(1);
        Assertions.assertEquals("1", testMy);
    }

    @Test
    void remove() {
        myList.add(1, "1");
        myList.remove(1);
        Assertions.assertFalse(myList.isEmpty(), "Shouldn't be empty");
    }

    @Test
    void testRemove() {
        myList.add(1, "1");
        myList.remove("1");
        Assertions.assertFalse(myList.isEmpty(), "Shouldn't be empty");
    }

    @Test
    void get() {
        myList.add(1, "test");
        String testMy = myList.get(1);
        Assertions.assertEquals("test", testMy);
    }

    @Test
    void set() {
        myList.add(1, "testOpaF5");
        myList.set(1, "test");
        String testMy = myList.get(1);
        Assertions.assertEquals("test", testMy);
    }

    @Test
    void size() {
        Assertions.assertEquals(DEFAULT_SIZE, myList.size(), "Size should be equal to default value");
    }

    @Test
    void isEmpty() {
        Assertions.assertFalse(myList.isEmpty(), "Shouldn't be empty");
    }

    @Test
    void contains() {
        myList.add(1, "testOpaF5");
        boolean isContainsZeroValue = myList.contains("testOpaF5");
        Assertions.assertTrue(isContainsZeroValue, "");
    }

    @Test
    void clear() {
        myList.add(1, "testOpaF5");
        myList.add(2, "testOpa");
        myList.clear();
        Assertions.assertEquals(0, myList.size(), "Size should be equal to default value");
        Assertions.assertFalse(myList.isEmpty(), "Shouldn't be empty");
    }

    @Test
    void indexOf() {
        String str = "Java is fun";
        String characterWanted = "i";
        int actual = 5;
        int expected = str.indexOf(characterWanted);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void iterator() {

    }
}