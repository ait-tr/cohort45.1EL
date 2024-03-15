package homework4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your monthly income"); // Введите свой месячный заработок
        int income = scanner.nextInt();

        float socialTax = income * 0.03f; // 3%
        float incomeTax = income * 0.15f; // 15%

        System.out.println("Pension fund tax: " + socialTax);
        System.out.println("Income tax: " + incomeTax);
        System.out.println("Total profit: " + (income - incomeTax - socialTax));
    }
}
// у кого сдана домашка ИЛИ сейчас написали, ставим +