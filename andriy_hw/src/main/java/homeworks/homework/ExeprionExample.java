package homeworks.homework;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExeprionExample {

    public static void fd(int exeption) throws IOException {
        if (exeption == 0) {
            throw new FileNotFoundException("maybe error");
        }
    }

    void foo(int exeption) throws FileNotFoundException {
        try {
            fd(exeption);
        } catch (IOException e) {
            System.out.println("не весь стектрейс");
        } finally {
            System.out.println("finally");
        }
    }
}
