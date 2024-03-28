package classwork2503;

import java.util.Scanner;

public class Main04 {
    /*
    Вывести первые n чисел степеней двойки
    n вводится пользователем
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(Math.pow(2, i));
        }
    }
}
