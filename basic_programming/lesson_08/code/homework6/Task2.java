package code.homework6;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;
        int score = 0;

        System.out.println("1. \na)\nb)\nc)");
        answer = scanner.next().substring(0, 1);

        if (answer.equals("a")) {
            score++;
        }

        System.out.println("2. \na)\nb)\nc)");
        answer = scanner.next().substring(0, 1);

        if (answer.equals("c")) {
            score++;
        }

        System.out.println("3. \na)\nb)\nc)");
        answer = scanner.next().substring(0, 1);

        if (answer.equals("c")) {
            score++;
        }

        System.out.println("4. \na)\nb)\nc)");
        answer = scanner.next().substring(0, 1);

        if (answer.equals("b")) {
            score++;
        }

        System.out.println("5. \na)\nb)\nc)");
        answer = scanner.next().substring(0, 1);

        if (answer.equals("a")) {
            score++;
        }
        // a c c b a

        System.out.println("Your score: " + score + "/5");
        if (score < 3) {
            System.out.println("You failed!");
        } else {
            System.out.println("You passed!");
        }

    }
}
