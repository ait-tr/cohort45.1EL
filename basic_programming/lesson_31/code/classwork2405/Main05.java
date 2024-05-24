package classwork2405;

import java.util.HashSet;
import java.util.Set;

public class Main05 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("mango");
        set.add("apple");
        set.add("banana");
        set.add("apple");
        set.add("mango");
        set.add("grape");

        System.out.println(set);
    }
}
