package classwork0504;

public class Main03 {
    /*
    Напечатать все числа от 1 до 50, которые не делятся на 7 нацело
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 7 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
