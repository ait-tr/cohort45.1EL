package classwork1004;

public class Main03 {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = arr1;

        arr2[0] = 1;
        arr2[1] = 47;
        arr2[2] = 8;
        arr2[3] = 12;
        arr2[4] = 33;

        System.out.println(arr1[3]);
        System.out.println(arr2[3]);
    }
}
