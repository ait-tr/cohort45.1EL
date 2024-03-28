package classwork2703;

import java.util.Random;
import java.util.Scanner;

public class Main03 {

    /*
    Пользователь вводит размер массива, сгенерировать массив такого размера
    из псевдослучайных чисел в диапазоне 0-100
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size");
        int size = scanner.nextInt();
        if (size <= 0) {
            System.out.println("Invalid size!");
            return;
        }
        Random random = new Random();
        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        System.out.println("Generated array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        // Доп задание: сделать так, чтобы можно было указывать диапазон чисел тоже

        /*
        при size = 4, цикл будет выполнять:

        numbers[0] = rand...
        numbers[1] = rand...
        numbers[2] = rand...
        numbers[3] = rand...
         */
    }
}
