package consultation2803;

import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array identifier");
        String identifier = scanner.next();
        System.out.println("Enter amount of elements");
        int amount = scanner.nextInt();

        System.out.println("Here is your code:\n");
        for (int i = 0; i < amount; i++) {
            System.out.println("System.out.print(" + identifier + "[" + i + "] + \" \");");
        }
    }
}
