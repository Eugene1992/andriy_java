package interfaces.messageprint;

public class Test {
    public static void main(String[] args) {
        MessagePrinter messagePrinter = new ConsoleMessagePrinter();
        MessageProvider messageProvider = new FileMessageProvider();

        MessagePrintRunner messagePrintRunner = new MessagePrintRunner(messagePrinter, messageProvider);
        messagePrintRunner.print();
    }
}
