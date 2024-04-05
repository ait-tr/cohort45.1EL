package classwork0504;

import java.util.Scanner;

public class Main01 {
    /*
    Считать из консоли несколько вводимых пользователем строк.
    Максимум пользователь может ввести 10 дел.
    Дела нужно сохранять в массив строк.
    Вывести пользователю эти строки пронумерованными.
    Ввод заканчивается когда пользователь вводит слово "конец" (либо end, если программа написана на английском)
Пример:
    Ввод:
    Постирать штору
    Покормить кота
    Сделать домашнее задание
    Погулять
    конец
    Вывод:
    1. Постирать штору
    2. Покормить кота
    3. Сделать домашнее задание
    4. Погулять
     */


    /*
    1 Сканнер, массив и цикл

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] list = new String[10];

        int amount = 0;
        for (int i = 0; i < list.length; i++) {
            String item = scanner.nextLine();
            if (item.equalsIgnoreCase("end") || item.equalsIgnoreCase("Конец")) {
                break;
            }
            list[i] = item;
            amount++;
        }

        for (int i = 0; i < amount; i++) {
            System.out.println((i + 1) + ". " + list[i]);
        }
    }

}
