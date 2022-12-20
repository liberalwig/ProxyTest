package ui;

public class ProxyPrinter implements Printer { // Printer 가 타깃오브젝트

    Printer printer;

    public ProxyPrinter(Printer printer){
        this.printer = printer;
    }

    @Override
    public void print(String msg) {

        System.out.println("===========Before===========");
        System.out.println("===========Around Start===========");
        printer.print(msg);
        System.out.println("===========Around End===========");
        System.out.println("===========After============");
    }
}
