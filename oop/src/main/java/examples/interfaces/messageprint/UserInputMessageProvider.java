package examples.interfaces.messageprint;

import java.util.Scanner;

public class UserInputMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        System.out.println("Enter message:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
