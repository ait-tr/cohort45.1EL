package consultation1403;

import java.util.Scanner;

public class Main04 {
    /*
    Студент получил оценки по математике, программированию и физике.
    Посчитать средний балл студента.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mathMark = scanner.nextInt();
        int programmingMark = scanner.nextInt();
        int physicsMark = scanner.nextInt();
        // целочисленное деление
        double avg = (mathMark + programmingMark + physicsMark) / 3.0;

        System.out.println(avg);
    }
}
