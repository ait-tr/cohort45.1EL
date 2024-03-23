package homework_03_22;

import java.util.Scanner;

//Подсчитать сумму всех четных чисел от 0 до N
// при том что N вводится пользователем

public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any integer number: ");
        int userNumber = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < userNumber; i = i + 2) {
            sum = sum + i;
        }
        System.out.println("The sum of all even numbers is:  " + sum);
    }
}
