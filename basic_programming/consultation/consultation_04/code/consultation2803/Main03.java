package consultation2803;

public class Main03 {
    public static void main(String[] args) {
        int[] array = {-7, -5, 2, -3, 8};

        // выводим массив
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        // умножить отрицательные на 3, а положительные на 5
        for (int i = 0; i < array.length; i++) {
            array[i] *= array[i] < 0 ? 3 : 5;
        }

        // выводим массив
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        // поменять знаки всем числам на противоположные
        for (int i = 0; i < array.length; i++) {
            array[i] *= -1;
        }

        // выводим массив
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
