package classwork0804;

import java.util.Random;
import java.util.Scanner;

public class Main02 {
    /*
    Создать метод, который кидает кости (D6)
     */
    // roll the dice - кинуть игральный кубик
    public static int rollDice() {
        Random random = new Random();
        int roll = 1 + random.nextInt(6);

        return roll;
        //return classwork0805.Main04.getRandomNumber(1, 6);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            int roll = rollDice();
            System.out.println("Dice rolled " + roll);

            input = scanner.next();

        } while (!input.equals("0"));
    }
}
