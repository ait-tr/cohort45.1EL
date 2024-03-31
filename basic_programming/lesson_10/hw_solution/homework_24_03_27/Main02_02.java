package homework_24_03_27;

/*
    1.Сгенерировать массив из 10 случайных значений от 1 до 100.
      Вывести этот массив.
    2.Дополнительное задание: выполнить разворот массива не создавая второй массив.
 */

import java.util.Random;

public class Main02_02 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        System.out.print("Original: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + "      ");
        }
        System.out.println();
        System.out.print("  Mirror: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[array.length - 1 - i] + "      ");
        }
    }
}
