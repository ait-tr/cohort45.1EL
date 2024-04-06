package homework_24_03_25;

import java.util.Random;
import java.util.Scanner;

/*
Создать в программе массив с 10 случайными значениями (взять из головы). Вывести массив на экран.
Попросить пользователя выбрать одно любое значение из массива (считать из консоли значение элемента).
Вывести в консоль индекс первого элемента, значение которого равно выбранному пользователем значению.
Если в массиве нет такого элемента,
вывести соответствующее сообщение

Дополнительное задание 1:
Генерировать случайные числа с помощью генератора случайных чисел вместо того чтобы их придумывать самостоятельно

Дополнительное задание 2:
Вынести код который находит индекс значения в отдельный метод
 */
public class Main03 {
    public static void main(String[] args) {

        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = -50 + random.nextInt(50 + 51);
            System.out.print(array[i] + " ");
        }
        System.out.println("Enter value from array: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Element not found!");
        } else {
            System.out.println("Index of value is: " + index);
        }
    }
}
