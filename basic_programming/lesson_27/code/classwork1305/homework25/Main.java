package classwork1305.homework25;

import java.util.Scanner;

public class Main {
    public static double readNumber(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextDouble();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! Choose fence shape:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Polygon");

        int pick = scanner.nextInt();
        Shape shape = null;
        double a;
        double b;
        switch (pick) {
            case 1:
                a = readNumber("Enter radius:");
                shape = new Circle(a);
                break;
            case 2:
                a = readNumber("Enter length");
                b = readNumber("Enter width");
                shape = new Rectangle(a, b);
                break;
            case 3:
                a = readNumber("Enter amount of sides");
                b = readNumber("Enter length of one side");
                shape = new Polygon(b, (int)a);
                break;
            default:
                System.out.println("Shape not found!");
                return;
        }
        System.out.println("Enter price per meter of fence:");
        double price = scanner.nextDouble();
        System.out.println("Total: " + shape.getPerimeter() * price);
    }
}
