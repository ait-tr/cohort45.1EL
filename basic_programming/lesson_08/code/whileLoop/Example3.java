package code.whileLoop;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        boolean condition = true;

        Scanner scanner = new Scanner(System.in);

        while (condition) {

            System.out.println("Please chose menu number: ");
            System.out.println("1. Monday");
            System.out.println("2. Wednesday");
            System.out.println("3. Friday");
            System.out.println("4. Exit");

            int userChoose = scanner.nextInt();

            switch (userChoose) {
                case 1:
                    System.out.println("Your choice is Monday");
                    break;
                case 2:
                    System.out.println("Your choice is Wednesday");
                    break;
                case 3:
                    System.out.println("Your choice is Friday");
                    break;
                case 4:
                    System.out.println("Exit ...");
                    condition = false;
                    break;
                default:
                    System.out.println("Wrong choose");
                    break;
            }

        }

        System.out.println("Loop while finished!");

    }
}
