package classwork2003;

import java.util.Scanner;

public class Main01 {
    // программа, которая превращает цифру в словесную форму
    // 1 -> one
    // 2 -> two
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String answer;
        switch (n) {
            case 0:
                answer = "zero";
                break;
            case 1:
                answer = "one";
                break;
            case 2:
                answer = "two";
                break;
            case 3:
                answer = "three";
                break;
            case 4:
                answer = "four";
                break;
            case 5:
                answer = "five";
                break;
            case 6:
                answer = "six";
                break;
            case 7:
                answer = "seven";
                break;
            case 8:
                answer = "eight";
                break;
            case 9:
                answer = "nine";
                break;
            default:
                answer = "undefined";
        }

        System.out.println(answer);

        if (n == 0) {
            System.out.println("zero");
        } else if (n == 1) {
            System.out.println("one");
        } else if (n == 2) {
            System.out.println("two");
        } else if (n == 3) {
            System.out.println("three");
        } else if (n == 4) {
            System.out.println("four");
        } else if (n == 5) {
            System.out.println("five");
        } else if (n == 6) {
            System.out.println("six");
        } else if (n == 7) {
            System.out.println("seven");
        } else if (n == 8) {
            System.out.println("eight");
        } else if (n == 9) {
            System.out.println("nine");
        } else {
            System.out.println("undefined");
        }




    }
}
