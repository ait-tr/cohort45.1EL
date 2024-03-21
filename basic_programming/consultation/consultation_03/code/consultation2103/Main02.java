package consultation2103;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int petals = scanner.nextInt() % 6;

        String answer = "";

        switch (petals) {
            case 1:
                answer = "I love you";
                break;
            case 2:
                answer = "a little";
                break;
            case 3:
                answer = "a lot";
                break;
            case 4:
                answer = "passionately";
                break;
            case 5:
                answer = "madly";
                break;
            case 0:
                answer = "not at all";
        }

        System.out.println(answer);
    }
}
