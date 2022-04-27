package homeworks.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyListTest {

    private static final int DEFAULT_SIZE = 20;
    private MyList<String> myList;

    public MyListTest(MyList<String> myList) {
        this.myList = myList;
    }

    @BeforeEach
    public void setUp() {
        for (int i = 0; i < DEFAULT_SIZE; i++) {
            myList.add(String.valueOf(i));
        }
    }

    @Test
    void add() {
    }

    @Test
    void testAdd() {
    }

    @Test
    void arrayCopy() {
    }

    @Test
    void remove() {
    }

    @Test
    void testRemove() {
    }

    @Test
    void get() {
    }

    @Test
    void set() {
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
        boolean isContainsZeroValue = myList.contains("0");
        Assertions.assertTrue(isContainsZeroValue, "");
    }

    @Test
    void clear() {
    }

    @Test
    void indexOf() {
    }

    @Test
    void iterator() {
    }
}