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
        System.out.println("Что во что вы хотите перевести 1) ºF -> ºC  или   2) ºC -> ºF  или  3) Выход ");
        double conversion = scanner.nextDouble();  //  перевод
        while (true) {
            if (conversion == 1) {
                System.out.println("Введите количество градусов : ");
                double degrees = scanner.nextDouble();
                double degreesCelsius = toCelsius(degrees);
                System.out.println("Температура в градусах цельсия равна :  " + degreesCelsius + "  ºC");
                break;
            } else if (conversion == 2) {
                System.out.println("Введите количество градусов : ");
                double degrees = scanner.nextDouble();
                double degreesFahrenheit = toFahrenheit(degrees);
                System.out.println("Температура в градусах фаренгейта равна :  " + degreesFahrenheit + "  ºF");
                break;
            } else if (conversion == 3) {
                System.out.println("Выход");
                break;
            }
        }
    }
}
