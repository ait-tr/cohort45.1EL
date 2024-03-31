package homework_24_03_25;

import java.util.Arrays;
import java.util.Scanner;

/*
Считать из консоли начальное значение, шаг и количество элементов числовой последовательности.
В этой последовательности каждый следующий элемент должен быть ровно на один шаг больше предыдущего.
Записать последовательность в массив, посчитать и вывести на экран сумму этих элементов.

 */
public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите начальное значение, шаг и количество элементов :");
        int number = scanner.nextInt();
        int step = scanner.nextInt();
        int size = scanner.nextInt();
        int[] array = new int[size];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = number + i * step;
            sum = sum + array[i];
        }
        System.out.println("Массив: " + Arrays.toString(array) + " ");
        System.out.print("Сумма: " + sum);
    }
}

