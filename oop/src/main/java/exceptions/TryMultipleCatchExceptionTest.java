package exceptions;

public class TryMultipleCatchExceptionTest {
    public static void main(String[] args) {
        System.out.println();

        Integer number = null;
        try {
            number = Integer.valueOf("dsd");
            f();
        } catch (StackOverflowError e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException | Error e) {
            e.printStackTrace();
        }

        System.out.println();
    }

    public static void f() {
        f();
    }
}
