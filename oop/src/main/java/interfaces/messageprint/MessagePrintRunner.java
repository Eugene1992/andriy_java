package interfaces.messageprint;

public class MessagePrintRunner {
    private MessageProvider provider;
    private MessagePrinter printer;

    public MessagePrintRunner(MessagePrinter printer, MessageProvider provider) {
        this.provider = provider;
        this.printer = printer;
    }

    public void print() {
        String message = provider.getMessage();
        printer.printMessage(message);
    }
}
