package homework_24_04_08;
/*
Написать программу переводчик из Цельсия Фаренгейт и наоборот.
В программе сначала нужно спросить пользователя что во что он хочет перевести (C -> F или F -> C)
Затем спросить количество градусов которые нужно перевести.
Для перевода написать 2 метода:
" double toCelsius(double degrees) "
" double toFahrenheit(double degrees) "
Первый будет переводить Фаренгейт в Цельсий а второй Наоборот.
В зависимости от выбора в начале программы вызвать соответствующий метод.
Ограничение:
во всей программе из сканера можно читать только два раза.
Дополнительное задание:
использовать в программе тернарный оператор вместо условного где применимо,
программа не заканчивалась пока пользователь этого не захочет.
 */

import java.util.Scanner;

public class Main02 {
    public static double toCelsius(double degrees) {
        return (degrees - 32) / 1.8;        //  Фаренгейт в Цельсий
    }

    public static double toFahrenheit(double degrees) {
        return degrees * 1.8 + 32;          //  Цельсий в Фаренгейт
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
