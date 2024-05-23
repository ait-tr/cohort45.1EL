package classwork2205;

import java.util.ArrayList;
import java.util.List;

public class Main02 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Grapes");
        fruits.add("Orange");
        fruits.add("Melon");
        fruits.add("Pear");
        /*
        for (String s : fruits) {
            System.out.println(s);
        }
        */
        System.out.println(fruits);
        fruits.remove("Melon");
        System.out.println(fruits);
        fruits.clear();
        System.out.println(fruits);
    }
}
