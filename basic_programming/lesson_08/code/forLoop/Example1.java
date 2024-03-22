package code.forLoop;

public class Example1 {
    public static void main(String[] args) {
        /*
        напечатать все ЧЕТНЫЕ число в диапазоне от 1 до 20
         */

        for (int i = 1; i < 21 ; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}
