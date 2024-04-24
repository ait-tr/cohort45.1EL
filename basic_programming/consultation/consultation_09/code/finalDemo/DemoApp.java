package finalDemo;
/*
@date 23.04.2024
@author Sergey Bugaienko
*/

import java.util.Arrays;

public class DemoApp {

    public static void main(String[] args) {
        final int x;
        // кусок кода

        x = 50;

        // x = 1000; не могу присвоить новое значение final - примитиву

        System.out.println(x);

        System.out.println("=====================\n");

        final int[] ints = {1, 2, 4, 5, 6, 7, 8, 9};

//        System.out.println(ints[0]);
        System.out.println("ints: " + Arrays.toString(ints));

        // ints = new int[3]; не могу "прикрепить" другой объект

        ints[2] = 1000;
        ints[ints.length -1] = -500;


        System.out.println("new array: " + Arrays.toString(ints));

    }
}
