package homeworks.homework.secound;

public class UnExeprionArithmeticException {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException exception) {
            exception.printStackTrace();
        }
    }

}
