package examples.exceptions;

public class TryCatchBlockedFinallyExceptionTest {
    public static void main(String[] args) {
        System.out.println();

        Integer number = null;
        try {
//            while (Integer.valueOf("2") == 2) {}
//            System.exit(0);
            number = Integer.valueOf("dsd");
        } catch (NumberFormatException e) {
            throw new RuntimeException();
        } finally {
            System.out.println("Finally");
        }

        System.out.println(number);
    }
}
