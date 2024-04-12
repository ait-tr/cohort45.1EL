package homework11;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("Приветствуем в CurrencyConverter!");
        while (true) {
            System.out.println("Выберите исходную валюту:");
            String[] currencies = {"EURO", "USD", "TL"};

            for (int i = 0; i < currencies.length; i++) {
                System.out.println((i + 1) + ". " + currencies[i]);
            }
            System.out.println("0. Выход");

            Scanner scanner = new Scanner(System.in);
            int initialCurrency = scanner.nextInt();
            if (initialCurrency == 0) {
                return;
            }
            System.out.println("Введите количество:");
            double amount = scanner.nextDouble();
            System.out.println("Выберите целевую валюту (из списка выше):");
            int targetCurrency = scanner.nextInt();

            double[] coefficients = {1, 1.06, 34.42};
            amount /= coefficients[initialCurrency - 1];
            amount *= coefficients[targetCurrency - 1];

            System.out.println("Total: " + amount + " " + currencies[targetCurrency - 1]);
        }
    }
}
