package examples.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class IoExceptionTest {
    public static void main(String[] args) {

        try {
            getFileInputStream("C:/data/examples.test.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static FileInputStream getFileInputStream(String path) throws FileNotFoundException, RuntimeException {
        File file = new File(path);

        return new FileInputStream(file);
    }
}
