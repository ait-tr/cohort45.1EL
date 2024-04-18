/*
@date 18.04.2024
@author Sergey Bugaienko
*/

public class Consultation8 {

    public static void main(String[] args) {

        int sum = sumInts(1, 5);
        System.out.println(sum);

        printIntString("Hello", 10);
        String str1 = "Java" + (5 + 7);
//        System.out.println(str1);

        printIntString(10, "Java");

        System.out.println(" =============================== \n");


        System.out.println(sumInts(1, 5, 6, 7, 7, 8));


    }

    public static int sumInts(int x, int y) {

        return y + x;
    }

    public static int sumInts(int a, int b, int c) {
        return a + b + c;
    }

    public static int sumInts(int... ints) {
        System.out.println("количество элементов: " + ints.length);
        System.out.println(ints[0]);

        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            sum += ints[i];
        }
        return sum;
    }

    public static String sumInts(String str, String str1) {

        return str + str1;
    }


    public static void printIntString(String str, int n) {
        System.out.println(str + n + 5);
    }

    public static void printIntString(int n, String str) {
        System.out.println(n + 5 + str);
    }


}
