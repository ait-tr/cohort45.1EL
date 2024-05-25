package generics;
/*
@date 25.05.2024
@author Sergey Bugaienko
*/

public class GenericApp {
    public static void main(String[] args) {

        GenericBox<String> box = new GenericBox<>("Hello");

        String str = box.getValue();
        System.out.println(str.toUpperCase());

        /*
        int -> Integer
        char -> Character
        byte -> Byte
        short -> Short
         */

        Integer wrapperInt = 5; // автоупаковка
        System.out.println(wrapperInt);
        int x = wrapperInt; // автораспаковка


        GenericBox<Integer> box1 = new GenericBox<>(10);
        int v = box1.getValue();

        GenericBox<Integer> test = new GenericBox<>(30);

    }
}
