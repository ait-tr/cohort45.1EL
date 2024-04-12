package homework13;

import java.util.Scanner;

public class Task2 {

    public static double toCelsius(double degrees) {
        return (degrees - 32) * 5 / 9.0;
    }

    public static double toFahrenheit(double degrees) {
        return degrees * 1.8 + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Temperature unit converter. Choose conversion:");
        System.out.println("1. C -> F");
        System.out.println("2. F -> C");
        int pick = scanner.nextInt();
        System.out.println("Enter amount: ");
        double amount = scanner.nextDouble();
        double res = 0;
        if (pick == 1) {
            res = toFahrenheit(amount);
        } else if (pick == 2) {
            res = toCelsius(amount);
        } else {
            System.out.println("No such option!");
            return;
        }
        System.out.println("Result: " + res);
    }
}
