package HomeWork14;

public class Main {
    public static void main(String[] args){
        Printer printer =new MessagePrint();

        MessagePrint.Message message1 = new MessagePrint.Message("Hello world!", "Marina");
        MessagePrint.Message message2 = new MessagePrint.Message("", "Shyrkova");

        printer.print(message1);
        printer.print(message2);
    }
}
