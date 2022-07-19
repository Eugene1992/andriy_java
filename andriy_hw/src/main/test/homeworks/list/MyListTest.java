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
        MyList<String> myEmptyList = new MyLinkedList<>();
        myEmptyList.add(0, "1");
        myEmptyList.remove(0);
        Assertions.assertTrue(myEmptyList.isEmpty(), "Should be empty");
    }

    @Test
    void testRemove() {
        MyList<String> myEmptyList = new MyLinkedList<>();
        myEmptyList.add(0, "1");
        myEmptyList.remove("1");
        Assertions.assertNotEquals(myEmptyList.get(0),"1");
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
        MyList<String> myEmptyList = new MyLinkedList<>();
        Assertions.assertTrue(myEmptyList.isEmpty(), "Should be empty");
        String elem = "qqq";
        myEmptyList.add(elem);
        Assertions.assertFalse(myEmptyList.isEmpty(), "Shouldn't be empty");
        myEmptyList.remove(elem);
        Assertions.assertTrue(myEmptyList.isEmpty(), "Should be empty");
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
        Assertions.assertTrue(myList.isEmpty(), "Should be empty");
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