package homework09;

import java.util.Scanner;

public class Task02 {
    /*
    1 Ввод данных
    2 Создать массив и посчитать
    3 Посчитать сумму всех элементов массива
    4 Вывести результат
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double initialValue = scanner.nextDouble(); // initial value - начальное значение
        double step = scanner.nextDouble(); // step - шаг
        int amount = scanner.nextInt(); // amount - количество

        double[] sequence = new double[amount]; // sequence - последовательность
        // в нулевой элемент записываем начальное значение
        sequence[0] = initialValue;
        for (int i = 0; i < amount - 1; i++) {
            // следующий элемент вычисляем как сумму текущего элемента и шага (т.е. следующий на шаг больше предыдущего)
            sequence[i + 1] = sequence[i] + step;
        }

        double sum = 0;
        for (int i = 0; i < sequence.length; i++) {
            sum += sequence[i];
        }
        /*
        sequence[0] - нулевой элемент
        sequence[2] - второй элемент
        sequence[i] - каждый элемент, если в цикле for
         */

        System.out.println("Sum: " + sum);
    }

}
