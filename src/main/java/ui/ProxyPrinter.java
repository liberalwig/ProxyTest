package ui;

public class ProxyPrinter implements Printer { // Printer 가 타깃오브젝트

    Printer printer;

    public ProxyPrinter(Printer printer){ // Client 클래스에서 new ProxyPrinter 객체를 생성하므로 여기에 생성자 만들어둠
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
