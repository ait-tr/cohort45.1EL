package classwork2003;

import java.util.Scanner;

public class Main04 {
    /*
    Идентифицировать, могут ли быть три введенных числа сторонами треугольника
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a + b > c
                && b + c > a
                && c + a > b) {
            System.out.println("This is a triangle");
        } else {
            System.out.println("This is not a triangle");
        }
        // Доп задание: модифицировать таким образом, чтобы программа также определяла вид треугольника
        // т.е. Острый, тупой, равнобедренный, прямоугольный
    }
}
