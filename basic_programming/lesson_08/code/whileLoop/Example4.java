package code.whileLoop;

import java.util.Scanner;

public class Example4 {
    /**
     * Запросить у пользователя несколько чисел с клавиатуры (по одному)
     * Сложить эти числа
     * Если введенное число будет 0 или меньше 0, то прекратить ввод чисел

     * Распечатать итоговую сумму и завершить работу программы
     *
     * в ЦИКЛЕ :
     - сканер - Запросить число у пользователя
     - присвоили это число в какую-то переменную
      - проверка - если число > 0, то прибавить это число к сумме чисел
     а если число <= 0, то прекратить (ВЫЙТИ ИЗ ЦИКЛА)

     *
     *
     * распечатать сумму
     *
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int summa = 0;
        boolean condition = true;


        while (condition) {
            System.out.println("Please enter integer number ( negative number for exit )");

            int userNumber = sc.nextInt();
            if (userNumber > 0) {
                summa = summa + userNumber;
            } else {
                condition = false;
            }
        }

        System.out.println("Сумма всех введенных чисел = " + summa);
    }
}
