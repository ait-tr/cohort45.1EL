package code.homework6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight in kg");
        int weight = scanner.nextInt();
        System.out.println("Enter your height in cm");
        float height = scanner.nextInt() / 100f;

        float bmi = weight / (height * height);
        System.out.println("Your BMI: " + bmi);

        if (bmi <= 15) {
            System.out.println("Anorexia");
        } else if (bmi <= 20) {
            System.out.println("Underweight");
        } else if (bmi <= 25) {
            System.out.println("Normal weight");
        } else if (bmi <= 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obesity");
        }
    }
}
