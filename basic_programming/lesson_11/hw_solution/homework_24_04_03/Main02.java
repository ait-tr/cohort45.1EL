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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Приветствуем в CurrencyConverter!\n");
        double[] array = {0, 1.0, 1.08, 7.84, 0.86, 164.27};

        for (int i = 0; i < array.length; i++) {
            System.out.println("Выберите исходную валюту");
            System.out.print("1)EURO   2)USD   3)CNY   4)GBP   5)JPY   0)Выход :  ");
            int currency = scanner.nextInt();  //  исходная  валюта
            if (currency == 0) {
                System.out.println("Выход____________________");
                break;
            }
            System.out.print("Введите  сумму которую вы хотите обменять :  ");
            double exchangeAmount = scanner.nextDouble(); //  сумма для обмена
            System.out.println("Выберите валюту в которую нужно перевести");
            System.out.print("1)EURO   2)USD   3)CNY   4)GBP   5)JPY   :  ");
            int targetCurrency = scanner.nextInt();  //  целевая  валюта

            i = currency;
            double res;
            if (targetCurrency == 1) {
                res = exchangeAmount / array[i] * 1.0;
                System.out.println("Сумма после обмена :   " + Math.ceil(res) + "  EURO");
            } else if (targetCurrency == 2) {
                res = exchangeAmount / array[i] * 1.08;
                System.out.println("Сумма после обмена :   " + Math.ceil(res) + "  USD");
            } else if (targetCurrency == 3) {
                res = exchangeAmount / array[i] * 7.84;
                System.out.println("Сумма после обмена :   " + Math.ceil(res) + "  CNY");
            } else if (targetCurrency == 4) {
                res = exchangeAmount / array[i] * 0.86;
                System.out.println("Сумма после обмена :   " + Math.ceil(res) + "  GBP");
            } else if (targetCurrency == 5) {
                res = exchangeAmount / array[i] * 164.27;
                System.out.println("Сумма после обмена :   " + Math.ceil(res) + "  JPY");
            }
        }
    }
}
