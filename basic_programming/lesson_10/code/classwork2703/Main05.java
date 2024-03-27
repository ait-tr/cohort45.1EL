package classwork2703;

import java.util.Random;
import java.util.Scanner;

public class Main05 {
    /*
    Пользователь вводит размер массива, сгенерировать
    этот массив случайных чисел в диапазоне от -10 до 10
    Заменить все отрицательные числа на 0
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = scanner.nextInt();
        int[] array = new int[size];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = -10 + random.nextInt(10 - (-10) + 1);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = 0;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

}
