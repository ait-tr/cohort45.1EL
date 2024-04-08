package consultation0404;

import java.util.Scanner;

public class Main06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n > 0) { // если правдиво
            System.out.println("Positive number");
        } else if (n < 0) { // но если другое правдиво
            System.out.println("Negative number");
        } else { // в ином случае
            System.out.println("Odd number");
        }

    }
}
