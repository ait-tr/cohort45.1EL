package homework_24_03_27;

/*
    1.Сгенерировать массив из 10 случайных значений от 1 до 100.
      Вывести этот массив.
    2.Потом развернуть этот массив в обратном порядке.
      Вывести массив еще раз.
Важно: вы должны именно развернуть исходный массив, а не просто вывести его в обратном порядке
 */

import java.util.Random;

public class Main02_01 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        System.out.print("Original: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + "      ");
        }
        System.out.println();
        System.out.print(" Mirror:  ");
        int[] mirror = new int[array.length];
        for (int i = 0; i < mirror.length; i++) {
            mirror[i] = array[array.length -1 -i];
            System.out.print(mirror[i] + "      ");
        }
    }
}
