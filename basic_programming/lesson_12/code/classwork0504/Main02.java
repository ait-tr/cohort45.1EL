package classwork0504;

import java.util.Scanner;

public class Main02 {
/*

Считывать из консоли поочерёдно строки и числа.
Строка будет обозначать дело, а число - количество времени в минутах,
 которое надо потратить на это дело.
Вывести назад в консоль количество дел, список дел вместе с временем
и сколько времени понадобится чтобы выполнить все дела.
Ввод заканчивается когда пользователь вводит слово "конец"
(либо end, если программа написана на английском).
После слова "конец" программа не должна спрашивать количество времени.
Если слово "минут" не соответствует числу (например, если выводится 1 минут),
это не считается ошибкой.

    Постирать штору
    50
    Покормить кота
    2
    Сделать домашнее задание
    90
    Погулять
    120
 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] list = new String[10];
        int[] listTime = new int[10];

        int amount = 0;
        for (int i = 0; i < list.length; i++) {
            String item = scanner.nextLine(); // считывает все до символа \n
            if (item.equalsIgnoreCase("end") || item.equalsIgnoreCase("Конец")) {
                break;
            }
            listTime[i] = scanner.nextInt();
            scanner.nextLine();// чтобы поглотить (consume) знак \n
            list[i] = item;
            amount++;
        }

        int totalTime = 0;
        for (int i = 0; i < amount; i++) {
            totalTime += listTime[i];
        }
        System.out.println("Общее время: " + totalTime);

        for (int i = 0; i < amount; i++) {
            System.out.println((i + 1) + ". " + list[i] + " (" + listTime[i] + " минут)");
        }

        int maxIndex = 0;
        for (int i = 0; i < amount; i++) {
             if (listTime[maxIndex] < listTime[i]) {
                 maxIndex = i;
             }
        }
        System.out.println("Дольше всего займет дело: " + list[maxIndex]);
    }

}
