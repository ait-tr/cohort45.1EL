package classwork1705.example03;

import org.junit.jupiter.api.IndicativeSentencesGeneration;

public class Main {

    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Hello");
        list.add("world");
        list.add("java");

        for (String s : list) {
            System.out.println(s.toString());
        }

        MyArrayList<Integer> list1 = new MyArrayList<>();
        list1.add(5);
        list1.add(Integer.parseInt("123"));
        list1.add(Integer.valueOf(5896));

        for (int i : list1) {
            System.out.println(i);
        }
    }
}
