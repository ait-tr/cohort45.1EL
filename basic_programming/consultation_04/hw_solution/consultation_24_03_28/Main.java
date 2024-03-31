package consultation_24_03_28;

//  Найти большее и меньшее число в массиве.

public class Main {
    public static void main(String[] args) {
        int[] array = {-7, -5, 12, -3, 8, 20, 9, -6, 18};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println("\nIndex of max number: " + maxIndex + ", value: " + array[maxIndex]);
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        System.out.println("\nIndex of min number: " + minIndex + ", value: " + array[minIndex]);
    }
}
