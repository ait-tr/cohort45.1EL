package classwork0605;

import classwork0605.example01.Product;

import java.util.Random;
import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Object[] objects = new Object[10];
        objects[0] = 41;
        objects[1] = "Hello";
        objects[2] = new Scanner(System.in);
        objects[3] = new Random();
        objects[4] = new Product(123, "Tomato", 3.50);
        Object o = new Random();
    }
}
