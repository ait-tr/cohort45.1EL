package Homework13_03;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш вес в килограммах: ");
        float num1 = scanner.nextByte();
        System.out.println("Введите ваш рост в метрах: ");
        float num2 = scanner.nextByte();
        float res = num1 / ( num2 * num2);
        System.out.println(res);
    }
}
