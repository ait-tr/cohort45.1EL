package homework_24_04_08;
/*
Написать программу которая рассчитывает индекс массы тела и говорит о состоянии веса.
Для этого нужно написать и использовать такие методы:
1. спросить у пользователя его вес в килограммах и рост в сантиметрах
2. перевести рост в метры
3. рассчитать ИМТ по формуле
4. вывести результат расчётов в консоль и оценку веса
 */

import java.util.Scanner;

public class Main03 {
    public static void printWeight() {
        System.out.println("Введите ваш вес в килограммах: ");
    }

    public static void printHeight() {
        System.out.println("Введите ваш рост в сантиметрах: ");
    }

    public static double toMeter(double height) {
        return height / 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printWeight();
        double weight = scanner.nextDouble();
        printHeight();
        double height = scanner.nextDouble();
        double bmi = weight / (toMeter(height) * toMeter(height));

        if (bmi < 15.0) {
            System.out.println("Индекс массы вашего тела равен : " + bmi + "\nУ вас анорексия!");
        } else if (bmi < 20.0) {
            System.out.println("Индекс массы вашего тела равен : " + bmi + "\nУ вас недостаточный вес!");
        } else if (bmi < 25.0) {
            System.out.println("Индекс массы вашего тела равен : " + bmi + "\nУ вас нормальный вес!");
        } else if (bmi < 30.0) {
            System.out.println("Индекс массы вашего тела равен : " + bmi + "\nУ вас лишний вес!");
        } else if (bmi > 30.0) {
            System.out.println("Индекс массы вашего тела равен : " + bmi + "\nУ вас ожирение!");
        }
    }
}
