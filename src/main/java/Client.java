import ui.ColorPrinter;
import ui.Printer;
import ui.ProxyPrinter;

public class Client {

    public static void main(String[] args) {

        Printer printer = new ProxyPrinter(new ColorPrinter());
        printer.print("Hello");
    }
}