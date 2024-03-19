package homework_18_03;
    //Модифицировать ранее написанную программу про индекс массы тела так,
    // чтобы помимо результата также выводилась оценка веса
import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight in kilograms: ");
        float weight = scanner.nextFloat();
        System.out.println("Enter your height in meters: ");
        float height = scanner.nextFloat();
        float res = weight / (height * height);

        if (res < 15.0 ) {
            System.out.println("Your body mass index is: " + res + "\n\nYou have anorexia!");
        } else if (res < 20.0) {
            System.out.println("Your body mass index is: " + res + "\n\nYou are underweight!");
        } else if (res < 25.0) {
            System.out.println("Your body mass index is: " + res + "\n\nYour weight is normal!");
        } else if (res < 30.0) {
            System.out.println("Your body mass index is: " + res + "\n\nYou are overweight!");
        } else if (res > 30.0) {
            System.out.println("Your body mass index is: " + res + "\n\nYou are obese!");
        }
    }
}
