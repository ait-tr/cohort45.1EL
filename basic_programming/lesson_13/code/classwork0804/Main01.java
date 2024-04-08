package classwork0804;

import java.util.Scanner;

public class Main01 {

    public static void printTenNumbers() {
        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Printing 10 numbers:");
        printTenNumbers();
        System.out.println();

        System.out.println("Printing 10 numbers again:");
        printTenNumbers();

    }



}
