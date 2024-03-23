package homework_03_20;

// Элементарная валидация email
//через "Регулярное выражение"

import java.util.Scanner;

public class Main03 {

    public static boolean isValid(String email) {
        return email.matches("^[\\w-\\.]+@[\\w-]+(\\.[\\w-]+)*\\.[a-z]{2,}$");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your email : ");
        String email = scanner.nextLine();
        System.out.println("Valid: " + isValid(email));
    }
}