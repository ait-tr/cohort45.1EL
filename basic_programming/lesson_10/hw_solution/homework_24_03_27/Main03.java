package homework_24_03_27;

/*
"Шар с предсказаниями"

Пользователь задает вопрос. Вывести ему ответ-предсказание, симулируя популярный в поп-культуре магический шар
с нарисованной цифрой 8, который дает ответы на вопросы, если его потрясти.
Возможные варианты ответа:
Да.
Нет.
Весьма вероятно.
Не рассчитывай на это.
Не могу предсказать.
Да, но будь осторожен.
По всей видимости.
Знаки указывают на "да".
Знаки указывают на "нет".

Если хотите, чтобы на одни и те же вопросы программа давала одинаковые ответы, в качестве ключа (сида) ГСЧ
используйте строку, которую ввел пользователь, вызвав у нее метод .hashCode()

Пример 1:
    Ввод:
    Завтра пойдет дождь?
    Вывод:
    Знаки указывают на "нет".
Пример 2:
    Ввод:
    Я стану крутым программистом?
    Вывод:
    Весьма вероятно.

Доп задание: сделать все в одну строчку внутри меина
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте любой вопрос: ");
        String question = scanner.nextLine();
        String[] array = {"Да.", "Нет.", "Весьма вероятно.", "Не рассчитывай на это.",
                "Не могу предсказать.", "Да, но будь осторожен.", "По всей видимости.",
                "Знаки указывают на \"да\".", "Знаки указывают на \"нет\"." };
        Random random = new Random();
        int number = random.nextInt(9);
        if (number == 0) {
            System.out.println("Ответ:  " + array[0]);
        } else if (number == 1) {
            System.out.println("Ответ:  " + array[1]);
        } else if (number == 2) {
            System.out.println("Ответ:  " + array[2]);
        } else if (number == 3) {
            System.out.println("Ответ:  " + array[3]);
        } else if (number == 4) {
            System.out.println("Ответ:  " + array[4]);
        } else if (number == 5) {
            System.out.println("Ответ:  " + array[5]);
        } else if (number == 6) {
            System.out.println("Ответ:  " + array[6]);
        } else if (number == 7) {
            System.out.println("Ответ:  " + array[7]);
        } else if (number == 8) {
            System.out.println("Ответ:  " + array[8]);
        }

    }
}
