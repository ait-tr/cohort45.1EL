package classwork0504;

import java.util.Scanner;

public class Main05 {
    /*
    Пользователь вводит целое число
    Проверить, является ли число простым
    Простые числа - такие, которые делятся нацело только на себя и 1
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        long start = System.nanoTime(); // 10e-9
        boolean isPrime = true;
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        long finish = System.nanoTime();
        System.out.println("Time took: " + (finish - start) + "ns");
        if (isPrime) {
            System.out.println("Number is prime");
        } else {
            System.out.println("Number is not prime");
        }

    }
}
