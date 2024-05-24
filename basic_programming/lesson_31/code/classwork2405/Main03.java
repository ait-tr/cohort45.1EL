package classwork2405;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main03 {
    static List<LinkedList<Object>> hashTable = List.of(
            new LinkedList<>(),
            new LinkedList<>(),
            new LinkedList<>(),
            new LinkedList<>()
    );

    public static void add(Object value) {
        int hash = value.hashCode();
        int index = Math.abs(hash % hashTable.size());
        hashTable.get(index).add(value);
    }

    public static void print() {
        for (int i = 0; i < hashTable.size(); i++) {
            LinkedList<Object> list = hashTable.get(i);
            for (Object o : list) {
                System.out.println(i + ": " + o);
            }
        }
    }

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = new String("hello");
        System.out.println(s1 == s2);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        add("hello");
        add("java");
        add("programming");
        add("world");
        add("JVM");
        add("integer");
        add("double");
        print();

    }
}
