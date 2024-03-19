package homework_18_03;
    /*Разработайте систему тестирования, которая задаст пять вопросов по теме "Примитивные типы данных и переменные"
    На каждый тестовый вопрос должна быть возможность выбрать один из трех вариантов ответа (через сканнер).
    Если выбран правильный вариант, следует увеличить количество баллов на 1.
    В конце теста нужно вывести оценку. Если оценка 3 или выше написать "Вы справились с тестом", а если ниже - "Вы провалились"
 */
import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much space in bytes does one int take up in memory:  1)16 byte, 2)8 byte or 3)4 byte? \nEnter the correct answer: ");
        int oneInt = scanner.nextInt();
        System.out.println("What range of numbers can 1 byte store : 1)from 0 to 1, 2)from -128 to 127, or 3)from -3.4*1038 to 3.4*1038? \nEnter the correct answer: ");
        int rangeOfNumbers = scanner.nextInt();
        System.out.println("Choose where the float number is written correctly : 1) 752f,  2) 125L  or 3) 371.5fl \nEnter the correct answer: ");
        int floatNumber = scanner.nextInt();
        System.out.println("How many values can the boolean variable take : 1)32,  2)16, or  3)2 ? \nEnter the correct answer: ");
        int booleanVariable = scanner.nextInt();
        System.out.println("Choose the correct char variable notation :  1) 'm',   2) \"T\"  or 3) 'Hello!' \nEnter the correct answer:  ");
        int charVariable = scanner.nextInt();
        int answer1 = oneInt -= 2;
        if (answer1 == 1) {
            answer1 = 1;
        } else {
            answer1 = 0;
        }
        int answer2 = rangeOfNumbers --;
        if (answer2 == 1) {
            answer2 = 1;
        } else {
            answer2 = 0;
        }
        int answer3 = floatNumber;
        if (answer3 == 1) {
            answer3 = 1;
        } else {
            answer3 = 0;
        }
        int answer4 = booleanVariable -= 2;
       if (answer4 == 1) {
            answer4 = 1;
        } else {
            answer4 = 0;
        }
        int answer5 = charVariable;
        if (answer5 == 1) {
            answer5 = 1;
        } else {
            answer5 = 0;
        }
        int res = answer1 + answer2 + answer3 + answer4 + answer5;
        if (res >= 3) {
            System.out.println("You passed the test!");
        } else {
            System.out.println("You failed the test!");
        }
    }
}
