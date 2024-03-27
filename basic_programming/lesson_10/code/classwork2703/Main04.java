package classwork2703;

import java.util.Scanner;

public class Main04 {

    public static void main(String[] args) {
        int[] array = {17, 5, -6, 0, 1, 8};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            // Доп задание: сделать так, чтобы числа выводились через запятую
            // При этом, запятой не должно быть после последнего числа
        }
        System.out.println("Enter value from array");

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
            System.out.println("Element not found");
        } else {
            System.out.println("Index of value is: " + index);
        }

    }
}
