package homework_24_03_27;
/*
Пользователь вводит размер массива и сам массив целых чисел.
Удвоить каждое число и вывести результат в консоль
Доп. задание:
Сделать также чтобы каждого элемента было в два раза больше
Т.е. вывод будет 2 2 6 6 10 10 14 14 18 18
Важно: Именно сделать чтобы так было в массиве, а не просто выводить по два раза
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите целлое число: ");
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
        System.out.print(Arrays.toString(array));
    }
}
