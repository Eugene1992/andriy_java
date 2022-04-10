package interfaces.messageprint;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        try {
            return String.join("", Files.readAllLines(Paths.get("test.txt")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
