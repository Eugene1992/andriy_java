package homeworks.homework.secound;

public class UnExeptionIndexOutOfBoundsException {
    public static void main(String[] args) {

        try {
            int[] myArray = new int[10];
            myArray[11] = 5;
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("exxxx");
        }
    }
}
