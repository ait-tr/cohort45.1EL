package classwork2703;

import java.util.Random;

public class Main01 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);
        System.out.println(number);

        //System.out.println((int)(Math.random() * 100));
    }
}
