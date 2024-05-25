package collections;
/*
@date 25.05.2024
@author Sergey Bugaienko
*/

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {

        Collection<String> collection = List.of("Hello", "Java", "Cohort 45");
        // объект итератора, который умеет последовательно перебирать элементы коллекции

//        while (iterator.hasNext()) {
//            String element = iterator.next();
//            System.out.println(element);
//        }

        for (String element : collection) {
            System.out.println(element);
        }

        //Работает только со списками (List)
//        for (int i = 0; i <  collection.size(); i++) {
//            String element = collection.get(i);
//            System.out.println(element);
//        }

        System.out.println("\n ===============\n");

        Collection<Integer> integers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        Collection<Integer> numbers = new ArrayList<>(List.of(3, 2, 1));


        System.out.println("size: " + integers.size());
        System.out.println("isEmpty: " + integers.isEmpty()); // true, если пустая. false - в противном случае
        System.out.println("contains: " + integers.contains(1)); // true, /Если коллекция содержит указанный элемент
        System.out.println("add: " + integers.add(7)); // boolean. В случае успешного добавления - вернет true
        System.out.println("remove: " + integers.remove("Small")); // удаляет элемент из коллекции. true, если нашел и удалил
        System.out.println("ContainsAll: " + integers.containsAll(numbers)); // Возвращает true, если коллекция содержит все элементы из указанной коллекции
        System.out.println("removeAll: " + integers.removeAll(numbers)); // Удаляет все элементы из коллекции
        System.out.println(integers);
        System.out.println("addAll: " + integers.addAll(numbers));
        System.out.println(integers);
        System.out.println("retainAll: " + integers.retainAll(List.of(1,2,3,6))); // оставляет в коллекции только те элементы, которые содержит указанная колекция
        System.out.println(integers);
        numbers.clear(); // удаляет все элементы коллекция
        System.out.println(numbers);
        System.out.println("numbers.isEmpty()): " + numbers.isEmpty());

        Object[] intArray = integers.toArray();

        Integer[] intArr = integers.toArray(new Integer[0]);
        System.out.println(Arrays.toString(intArr));

        Set<Integer> integers1 = new HashSet<>();


    }
}
