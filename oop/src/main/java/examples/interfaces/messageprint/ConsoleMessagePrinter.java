package examples.interfaces.messageprint;

public class ConsoleMessagePrinter implements MessagePrinter {
    @Override
    public void printMessage(String message) {
        System.out.println(message);
    }
}
