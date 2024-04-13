package homework_24_04_03;
/*
Задание 1
Приветствуем в CurrencyConverter!
Выберите исходную валюту:   1. EURO  2. USD  3. TL
Если хотите, добавьте в этот список любые валюты на ваше усмотрение.
Создайте сканнер и прочитайте выбор пользователем исходной валюты.
После этого, спросите сумму денег в исходной валюте.
Потом, спросить валюту в которую нужно перевести.
Произвести перевод количества из исходной валюты в целевую и вывести на экран.
Подсказка: засунуть все курсы относительно базовой валюты в массив.
Задание 2
Сделать так, чтобы программа не заканчивалась, пока пользователь не выберет выход
Выход должен быть последним пунктом с номером 0 в списке исходных валют:
Приветствуем в CurrencyConverter!
Выберите исходную валюту:   1. EURO     2. USD      3. TL   0. Выход
 */

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        System.out.println("Приветствуем в CurrencyConverter!");
        while (true) {
            System.out.println("Выберите исходную валюту:");
            String[] currencies = {"EURO", "USD", "CNY", "GBP", "JPY"};

            for (int i = 0; i < currencies.length; i++) {
                System.out.println((i + 1) + ". " + currencies[i]);
            }
            System.out.println("0. Выход");

            Scanner scanner = new Scanner(System.in);
            int initialCurrency = scanner.nextInt();
            if (initialCurrency == 0) {
                return;
            }
            System.out.println("Введите  сумму которую вы хотите обменять :  ");
            double amount = scanner.nextDouble();
            System.out.println("Выберите целевую валюту (из списка выше):");
            int targetCurrency = scanner.nextInt();

            double[] coefficients = {1, 1.06, 7.84, 0.86, 164.27};
            amount /= coefficients[initialCurrency - 1];
            amount *= coefficients[targetCurrency - 1];

            System.out.println("Total: " + amount + " " + currencies[targetCurrency - 1]);
        }
    }
}

