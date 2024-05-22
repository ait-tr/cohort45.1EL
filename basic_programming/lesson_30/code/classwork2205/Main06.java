package classwork2205;

import java.util.ArrayList;
import java.util.List;

public class Main06 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(
                List.of(45, 6854, 561, 4056, 654));
        // удалить все элементы больше 1000
        /*
        for (Integer i : list) {
            if (i > 1000) {
                list.remove(i);
            }
        }
        */

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 1000) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
}
