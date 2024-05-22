package classwork2205;

import java.util.*;

public class Main05 {

    /*
    Вернуть список элементов, которые есть только в одной из коллекций
     */
    /*
    A = [a, a, t, e, f, i, j]

    B = [t, g, g, i, k, f]

    difference = [a, e, g, j, k]
     */
    public static List<Character> diff(Collection<Character> a, Collection<Character> b) {
        List<Character> list = new ArrayList<>();
        for (char ch : a) {
            // если символ из коллекции а не содержится в коллекции б
            if (!b.contains(ch)) {
                // тогда добавляем в результат
                list.add(ch);
            }
        }
        for (char ch : b) {
            if (!a.contains(ch)) {
                list.add(ch);
            }
        }
        // еще нужно отсортировать и удалить повторяющиеся элементы
        return list;
    }

    /*
    "hello"
    "world"

    "h e w r d"

     */

    public static int[] removeSmallest(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        for (int i : numbers) {
            list.add(i);
        }
        Integer min = Integer.MAX_VALUE;
        for (int i : list) {
            if (min > i) {
                min = i;
            }
        }
        list.remove(min);
        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }

        return res;
    }
    public static int[] removeSmallestStreams(int[] numbers) {
        return Arrays.stream(numbers)
                .sorted()
                .skip(1)
                .toArray();
    }

    public static int[] removeSmallestSort(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        for (int i : numbers) {
            list.add(i);
        }
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        });
        list.remove(0);
        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }

        return res;
    }


}
