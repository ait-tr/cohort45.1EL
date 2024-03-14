package Homework13_03;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму фактической прибыли : ");
        float sum1 = scanner.nextInt();

        float res1 = sum1 * 0.03f;
        System.out.println(" Сумма налога в пенсионный фонд составляет: (3%) " + res1 + "€");

        float res2 = sum1 * 0.15f;
        System.out.println(" Сумма налога на заработок составляет: (15%) " + res2 + "€");

        float res3 = sum1 - res1 - res2;
        System.out.println(" Чистая прибыль составляет: " + res3 + "€");
    }
}
