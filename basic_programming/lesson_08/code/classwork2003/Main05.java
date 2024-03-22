package code.classwork2003;

import java.util.Scanner;

public class Main05 {
/*
A 100 - 90
B 90 - 75
C 75 - 60
D 60 - 30
F 30 - 0

Перевести оценку из 100-бальной системы в буквенную
 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mark = scanner.nextInt();

        if (mark < 30) {
            System.out.println("F");
        } else if (mark < 60) {
            System.out.println("D");
        } else if (mark < 75) {
            System.out.println("C");
        } else if (mark < 90) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }
        // Доп задание: также перевести оценку из буквенной в цифровую пятибальную,
        // НЕ ИСПОЛЬЗУЯ switch или любой другой оператор (в одну строчку)
    }
}
