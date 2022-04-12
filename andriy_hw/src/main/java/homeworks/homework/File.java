package homeworks.homework;

public class File {
    public static void main(String[] args) {

        Abv file = null;
//завдання 3
        try {
            file.show();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (IndexOutOfBoundsException ex) {
            ex.printStackTrace();
        } catch (RuntimeException exp) {
            exp.printStackTrace();
        } catch (Exception expt) {
            expt.printStackTrace();
        }
    }
}
