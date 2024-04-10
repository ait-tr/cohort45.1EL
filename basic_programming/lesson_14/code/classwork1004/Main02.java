package classwork1004;


import java.util.Random;

public class Main02 {

    /*
    Напечатать массив array в консоль через пробел в строку
     */
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /*
    Написать код, который создает массив размера size
    и заполняет его случайными значениями от min до max

    Вернуть этот массив как результат
     */
    public static int[] generateRandomArray(int min, int max, int size) {
        Random random = new Random();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = min + random.nextInt(max - min + 1);
        }
        return array;
    }

    /*
    Развернуть переданный массив array в обратном порядке
     */
    public static void reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < reversedArray.length; i++) {
            reversedArray[i] = array[reversedArray.length - i - 1];
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = reversedArray[i];
        }
    }

    public static void main(String[] args) {
        // Сгенерировать массив из 10 случайных значений от 1 до 100.
        int[] array = generateRandomArray(1, 100, 10);
        // Вывести этот массив.
        printArray(array);
        // Потом развернуть этот массив в обратном порядке.
        reverseArray(array);
        // Вывести массив еще раз.
        printArray(array);
    }
}
