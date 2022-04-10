package exceptions;

public class TryCatchExceptionTest {
    public static void main(String[] args) {
        System.out.println();

        Integer number = null;
        try {
            number = Integer.valueOf("dsd");
        } catch (NumberFormatException e) {
            throw new RuntimeException();
        } finally {
            System.out.println("Finally");
        }

        System.out.println(number);
    }
}
