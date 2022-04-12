package homeworks.homework.firstUncheked;

public class UnExeprionArithmeticException {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

}
