package code.practice;

import java.util.Scanner;

public class Task1 {
    /*
        проверить является ли число которое ввел пользователь - простым
   (делится без остатка только на 1 и на себя)

   1. запросить число у пользователя
   2. нам надо проверить и убедится, что среди чисел от 2 до нашего числа
   нет НИ ОДНОГО при делении нашего числа на которое остаток будет == 0

   Для этого нам нужно: в цикле пройтись по всем числам в диапазоне от 2 до нашего числа
   получить результат деления нашего числа на очередное и если вдруг окажется
   что при делении остаток будет == 0, то значит число не простое

     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число: ");

        int userInt = scanner.nextInt();

        boolean isSimple = true;

        for (int i = 2; i < userInt; i++) {
            if (userInt % i == 0) {
                isSimple = false;
            }
        }

        if (isSimple) {
            System.out.println("Число " + userInt + " является простым");
        } else {
            System.out.println("Число " + userInt + " не является простым");
        }



    }
}
