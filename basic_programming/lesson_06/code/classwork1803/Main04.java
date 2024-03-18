package classwork1803;

import java.util.Scanner;

public class Main04 {
    /*
    Пользователь вводит число, проверить его на парность
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println(num % 2 == 0 ? "even number" : "odd number");
        // Доп задание на дом: написать всю программу одной инструкцией
    }

}
