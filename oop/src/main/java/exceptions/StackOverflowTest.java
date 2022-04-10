package exceptions;

public class StackOverflowTest {
    public static void main(String[] args) {
        f();
    }

    static void f() {
        f();
    }
}
