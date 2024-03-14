package consultation1403;

import java.util.Scanner;

public class Main05 {
    /*
    Рассчитать цену товара после скидки. Цена и скидка в % вводится в консоли
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();
        int sale = scanner.nextInt();

        double finalPrice = price - (price * sale / 100.0);

        System.out.println(finalPrice);
    }
}
