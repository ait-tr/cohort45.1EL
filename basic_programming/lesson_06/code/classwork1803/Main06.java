package classwork1803;

import java.util.Scanner;

public class Main06 {
    /*
    Пользователь вводит число, проверить целое или нет
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num = scanner.nextFloat();

        if ((int)num == num) { // num % 1 == 0
            System.out.println("Whole"); // целое
        } else {
            System.out.println("Fractional"); // нецелое
        }
    }
}
