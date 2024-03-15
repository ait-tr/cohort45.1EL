package classwork1503;

import java.util.Scanner;

public class Main01 {
    /*
    Пользователь вводит три числа: число, нижняя и верхняя граница диапазона
    Вывести на экран true если число будет в указанном диапазоне.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int minNumber = scanner.nextInt();
        int maxNumber = scanner.nextInt();

        boolean inRange = number >= minNumber && number <= maxNumber;
        System.out.println(inRange);
    }
}
