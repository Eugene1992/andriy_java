package homework.firstUncheked;

import java.io.FileReader;
import java.io.IOException;

public class ExeptionNullPoint {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("pom.xml");
            file = null;
            file.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
