package homework15;

import java.util.Scanner;

public class Main {

    public static void printMenu(String[] currencies) {
        System.out.println("Выберите исходную валюту:");
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

    public static double exchange(int initialCurrency, double amount, int targetCurrency) {
        double[] coefficients = {1, 1.06, 34.42};
        amount /= coefficients[initialCurrency - 1];
        amount *= coefficients[targetCurrency - 1];

        return amount;
    }

    public static void main(String[] args) {
        System.out.println("Приветствуем в CurrencyConverter!");
        String[] currencies = {"EURO", "USD", "TL"};
        while (true) {
            printMenu(currencies);
            int initialCurrency = (int)readNumber("", 1, currencies.length);
            if (initialCurrency == 0) {
                return;
            }
            double amount = readNumber("Введите количество:", 0, 10_000_000);
            int targetCurrency = (int)readNumber("Выберите целевую валюту (из списка выше):", 1, currencies.length);

            amount = exchange(initialCurrency, amount, targetCurrency);
            System.out.println("Total: " + amount + " " + currencies[targetCurrency - 1]);

        }
    }
}
