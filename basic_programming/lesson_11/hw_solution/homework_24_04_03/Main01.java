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

public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Приветствуем в CurrencyConverter!\n");
        float[] array = {0, 1.0f, 1.08f, 7.84f, 0.86f, 164.27f};
        while (true) {
            System.out.println("Выберите исходную валюту");
            System.out.print("1)EURO   2)USD   3)CNY   4)GBP   5)JPY   0)Выход :  ");
            int currency = scanner.nextInt();  //  исходная  валюта
            if (currency == 0) {
                System.out.println("Выход____________________");
                break;
            }
            System.out.println("Введите  сумму которую вы хотите обменять :  ");
            float exchangeAmount = scanner.nextFloat(); //   сумма для обмена
            System.out.println("Выберите валюту в которую нужно перевести");
            System.out.print("1)EURO   2)USD   3)CNY   4)GBP   5)JPY  :  ");
            int targetCurrency = scanner.nextInt();  //   целевая  валюта
            float res;
            res = exchangeAmount / array[currency] * array[targetCurrency];
            System.out.println("Сумма после обмена :   " + Math.ceil(res));
        }
    }
}

