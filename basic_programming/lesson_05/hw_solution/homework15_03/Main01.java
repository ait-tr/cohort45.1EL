package homework15_03;
/*
# Вы все еще являетесь предпринимателем в сфере айти,
    и все еще доброчесно платите налоги.
# Но ваше государство решило заработать больше денег и
    ввело новый закон, увеличив налог на заработок для богатых.
# Теперь если вы зарабатываете больше 20000 в месяц,
    вы должны заплатить 22% налога,
    больше 10000 18% налога и
    если меньше 10000 - 13% налога.
# Перепишите разработанную ранее программу так,
чтобы она учитывала это изменение законодательства.
 */
import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your monthly income: "); // Введите свой месячный заработок
        float income = scanner.nextFloat();

        float socialTax = income * 0.03f; // 3%
        float incomeTaxAbove20000 = income * 0.22f; // 22%
        float incomeTaxAbove10000 = income * 0.18f; // 18%
        float incomeTaxBelow10000 = income * 0.13f; // 13%

        if (income > 20001) {
            System.out.println("Your pension fund tax: " + socialTax);
            System.out.println("Your income tax: " + incomeTaxAbove20000);
            System.out.println("Your total profit: " + (income - incomeTaxAbove20000 - socialTax));
        } else if (income <= 20000 && income >= 10001) {
            System.out.println("Your pension fund tax: " + socialTax);
            System.out.println("Your income tax: " + incomeTaxAbove10000);
            System.out.println("Your total profit: " + (income - incomeTaxAbove10000 - socialTax));
        } else if (income <= 10000) {
            System.out.println("Your pension fund tax: " + socialTax);
            System.out.println("Your income tax: " + incomeTaxBelow10000);
            System.out.println("Your total profit: " + (income - incomeTaxBelow10000 - socialTax));
        }
    }
}
