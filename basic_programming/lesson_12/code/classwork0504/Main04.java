package classwork0504;

import java.util.Random;
import java.util.Scanner;

public class Main04 {
    /*
    Игра "угадай число", где нужно угадывать число от 1 до 10.
    Программа загадывает число, пользователь пробует угадать.
    Если число угадано, программа поздравляет с выигрышем и заканчивает
    Если число не угадано, программа говорит, будет ли загаданное число меньше или больше
    Подсчитать к-во попыток угадывания
     */

    public static void main(String[] args) {
        Random random = new Random();
        // от 1 до 10
        int min = 1;
        int max = 100;
        int number = min + random.nextInt(max - min + 1);

        Scanner scanner = new Scanner(System.in);
        int attempts = 0;

        System.out.println("Guess the number between " + min + " and " + max);
        while (true) {
            int guess = scanner.nextInt();
            attempts++;

            if (guess == number) {
                System.out.println("This is correct!");
                System.out.println("Attempts: " + attempts);
                break;
            } else if (guess > number) {
                System.out.println("Too large number! Try again:");
            } else {
                System.out.println("Too small number! Try again:");
            }
        }
    }
}
