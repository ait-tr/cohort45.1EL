package classwork2205.example01;


public class Main {

    public static void main(String[] args) {
        HelloPrinter eng = new HelloPrinter() {
            @Override
            public void printHello() {
                System.out.println("Hello");
            }
        };
        HelloPrinter rus = new HelloPrinter() {
            @Override
            public void printHello() {
                System.out.println("Привет");
            }
        };
        HelloPrinter deu = new HelloPrinter() {
            @Override
            public void printHello() {
                System.out.println("Hallo");
            }
        };

        eng.printHello();
        rus.printHello();
        deu.printHello();

    }

}
