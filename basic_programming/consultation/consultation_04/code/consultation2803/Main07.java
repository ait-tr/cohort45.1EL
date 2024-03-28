package consultation2803;

public class Main07 {
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
    }
}
