package consultation2803;

public class Main06 {
    public static void main(String[] args) {
        int[] array = {-7, -5, 2, -3, 8};
        int[] array1 = array;

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        array[1] = 100;
        System.out.println();
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
    }
}
