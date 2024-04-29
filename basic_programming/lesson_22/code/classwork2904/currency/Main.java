package classwork2904.currency;

import java.util.Scanner;

public class Main {
    public static void printMenu() {
        System.out.println("Выберите исходную валюту:");
        Currencies[] currencies = Currencies.values();
        for (int i = 0; i < currencies.length; i++) {
            System.out.println((i + 1) + ". " + currencies[i]);
        }
        System.out.println("0. Выход");
    }

    public static double readNumber(String message, int min, int max) {
        Scanner scanner = new Scanner(System.in);
        double n;
        do {
            System.out.println(message);
            n = scanner.nextDouble();
        } while (n < min || n > max);
        return n;
    }

    public static void main(String[] args) {
        System.out.println("Приветствуем в CurrencyConverter!");
        Currencies[] currencies = Currencies.values();
        while (true) {
            printMenu();
            int input = (int)readNumber("", 0, currencies.length);
            if (input == 0) {
                return;
            }
            Currencies initialCurrency = currencies[input];

            double amount = readNumber("Введите количество:", 0, 10_000_000);
            input = (int)readNumber("Выберите целевую валюту (из списка выше):", 1, currencies.length);
            Currencies targetCurrency = currencies[input];

            amount = Currencies.exchange(initialCurrency, amount, targetCurrency);

            System.out.println("Total: " + amount + " " + targetCurrency);

        }
    }
}
