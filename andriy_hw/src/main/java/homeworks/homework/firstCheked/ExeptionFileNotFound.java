package homeworks.homework.firstCheked;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExeptionFileNotFound {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("somefile.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}


