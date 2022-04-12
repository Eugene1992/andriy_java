package examples.exceptions;

public class OutOfMemoryTest {
    public static void main(String[] args) {
        int[] ints = new int[Integer.MAX_VALUE];
    }
}
