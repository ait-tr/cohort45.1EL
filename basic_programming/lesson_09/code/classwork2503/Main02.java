package classwork2503;

import java.util.Scanner;

public class Main02 {
    /*
    Пользователь вводит сколько угодно чисел, посчитать сумму всех этих чисел
    Ввод останавливается когда вводится 0
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;

        do {
            number = scanner.nextInt();
            sum += number;
        } while (number != 0);

        System.out.println(sum);
    }
}
