package homeworks.homework;

public class File {
    public static void main(String[] args) {

        Abv file = null;

        try {
            file.show();
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } catch (IndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } catch (RuntimeException exception) {
            exception.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
