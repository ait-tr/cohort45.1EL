package homework_03_20;
/*  1.   Идентифицировать, могут ли быть три введенных числа
         сторонами треугольника
    2.   Дополнительное Задание:
         модифицировать таким образом, чтобы
         программа также определяла вид треугольника т. е.
         острый, тупой, равнобедренный, прямоугольный.
*/

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side length of the triangle \na) : ");
        int a = scanner.nextInt();
        System.out.print("Enter the side length of the triangle \nb) : ");
        int b = scanner.nextInt();
        System.out.print("Enter the side length of the triangle \nc) : ");
        int c = scanner.nextInt();

        if (a + b > c && a + c > b && b + c > a
                && a * a + b * b == c * c
                || a * a + c * c == b * b
                || b * b + c * c == a * a) {
            System.out.println("This is a right triangle!");
        } else if (a == c && a + c > b
                || b == c && b + c > a
                || a == b && a + b > c) {
            System.out.println("This is an isosceles triangle!");
        } else if (a + b > c && a + c > b && b + c > a
                && a * a + b * b > c * c
                && a * a + c * c > b * b
                && b * b + c * c > a * a) {
            System.out.println("This is an acute triangle!");
        } else if (a + b > c && a + c > b && b + c > a
                || a * a + b * b < c * c
                && a * a + c * c < b * b
                && b * b + c * c < a * a) {
            System.out.println(" 1 : This is an obtuse triangle!");
        } else {
            System.out.println("This is not a triangle!");
        }
    }
}
