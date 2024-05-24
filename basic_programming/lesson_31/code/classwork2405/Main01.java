package classwork2405;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Main01 {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Banana");
        queue.offer("Apple");
        queue.offer("Cherry");

        System.out.println("Poll: " + queue.poll());
        System.out.println("Peak: " + queue.peek());
        queue.offer("Pear");
        for (String s : queue) {
            System.out.println(s);
        }
        System.out.println("Queue is empty: " + queue.isEmpty());

    }
}
