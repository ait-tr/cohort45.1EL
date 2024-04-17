/*
@date 16.04.2024
@author Sergey Bugaienko
*/

import java.util.Arrays;

public class Main1 {
    // .gitignore
    // Синхронизация с удаленным репозиторием (взять самую свежую версию проекта)
    // Добавить в индекс git add
    // Фиксация изменений (Коммит)
    // Синхронизация с удаленным репозиторием (push наших изменений в удаленный репозиторий)


    // git commit -am ""

    public static void main(String[] args) {
        int x = 10;

        changeInt(x);


        System.out.println(x);

        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        changeArray(array);


//        System.out.println(array);
        System.out.println(array[0]);


        String string = "Java";
        String newString = string.toUpperCase();
        System.out.println("string: " + string);
        System.out.println("newString: " + newString);

        System.out.println((string + newString));
        System.out.println(string.concat(newString));
    }

    private static void changeArray(int[] arr) {
        arr[0] = 25;

        arr = new int[5];
        arr[0] = 100;

        System.out.println(Arrays.toString(arr));

    }

    private static void changeInt(int x) {
        x = x + 2;
    }


}
