package homework15_03;
/*
# Напишите программу, которая запросит ввести ваш возраст,
    и напишет, кем вы являетесь: ребенком, подростком,
    взрослым либо пожилым человеком.
# Возрастные рамки можете определить самостоятельно.
 */
import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        short age = scanner.nextShort();
        if (age >= 1 && age <= 12 ) {
            System.out.println("You are a child! ");
        } else if (age >= 13 && age <= 17) {
            System.out.println("You are a teenager! ");
        } else if (age >= 18 && age <= 49 ) {
            System.out.println("You are an adult! ");
        } else if (age >= 50) {
            System.out.println("You are an old man! ");
        }
    }
}
