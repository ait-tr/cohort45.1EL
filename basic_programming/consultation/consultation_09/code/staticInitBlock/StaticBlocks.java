package staticInitBlock;
/*
@date 23.04.2024
@author Sergey Bugaienko
*/

import java.util.Arrays;

public class StaticBlocks {
    private static String[] strings;
    static int counter = 10;

    private String title;
    private int capacity = 5; // задание значения по умолчанию

    static  {
        System.out.println("Вызов статического блока инициализации");

        // Выполняется строго один раз.
        // Вызывается до вызова конструктора класса. При загрузке самого класса в память JVM.
        strings = new String[3];
        strings[0] = "Word 0";
        strings[1] = "Word 1";
        strings[2] = "Word 2";
    }

    public StaticBlocks() {
        System.out.println("Вызов конструктора");
        this.capacity = 10;
        this.title = "Default";

        strings = new String[3];
        strings[0] = "String 0";
        strings[1] = "String 1";
        strings[2] = "String 2";
    }

    static {
        System.out.println("Второй блок статической инициализации");
        counter = 500;
    }

    { // Блок (не статической) инициализации
        System.out.println("НЕ статик блок инициализации");
        this.title = "InitMe";
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public static String[] getStrings() {
        return strings;
    }

    public static void printInfo() {
        System.out.println("strings[]: " + Arrays.toString(strings));
//        Статические члены класса НЕ имеют доступ к "обычным" (не статическим членам)
        // System.out.println("capacity: " + capacity);

    }

    public void showInfo() {
        System.out.println("capacity: " + capacity);
        System.out.println("static counter: " + counter);
        counter = 1000;
    }
}
