package staticInitBlock;
/*
@date 23.04.2024
@author Sergey Bugaienko
*/

import java.util.Arrays;

public class StaticApp {
    public static void main(String[] args) {
//        System.out.println("До вызова конструктора класса: " + Arrays.toString(StaticBlocks.strings));


        StaticBlocks sb = new StaticBlocks();

        System.out.println("\n =============================== \n");

//        StaticBlocks sb1 = new StaticBlocks();
//        System.out.println(sb.getTitle());
//        System.out.println(sb.getCapacity());

        System.out.println("После вызова конструктора класса: " + Arrays.toString(StaticBlocks.getStrings()));

        StaticBlocks.printInfo();
        sb.showInfo();

        System.out.println("value counter: " + StaticBlocks.counter);
    }
}
