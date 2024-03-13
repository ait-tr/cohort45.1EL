package classwork1303;

import java.util.Scanner;

public class Main06 {
    public static void main(String[] args) {
        // создаем сканнер
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a and b");
        // создаем переменные, и сразу в них читаем из консоли значения
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        // прибавляем введенные значения
        int res = a + b;
        // выводим результат на экран
        System.out.println("a + b = " + res);
        /*
        Доп ДЗ:
        Сделать так, чтобы при, например, вводе 2 3 программа выводила 2 + 3 = 5
         */
    }
}
