package homework05;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your monthly income"); // Введите свой месячный заработок
        int income = scanner.nextInt();

        float socialTax = income * 0.03f; // 3%
        float incomeTax;

        if (income > 20000) {
            incomeTax = income * 0.22f;
        } else if (income > 10000) {
            incomeTax = income * 0.18f;
        } else {
            incomeTax = income * 0.13f;
        }

        System.out.println("Pension fund tax: " + socialTax);
        System.out.println("Income tax: " + incomeTax);
        System.out.println("Total profit: " + (income - incomeTax - socialTax));
    }
}
