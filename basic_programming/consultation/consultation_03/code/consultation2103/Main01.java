package consultation2103;

import java.util.Random;
import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        int amount = 10;
        for (int i = 1; i < amount; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = amount - 1; i > 0; i--){
            for (int j = 1;j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
