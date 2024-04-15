package homework12;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task1 {
    /*
    Сделать симуляцию кассы, где пользователь пишет название продукта и получает его цену
    Для этого создать массив продуктов и массив цен.
    Запросить у пользователя название продукта.
    Если такого продукта нет в массиве продуктов, вывести соответствующее сообщение
    "такого продукта нет в магазине"
    Если продукт есть, вывести его цену.
    Дополнительное задание: пользователь также вводит количество продукта, которое ему нужно.
    Цена рассчитывается с учетом количества.
     */

    public static int findProduct(String[] products, String product) {
        for (int i = 0; i < products.length; i++) {
            if (product.equalsIgnoreCase(products[i])) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] products = {"Apple", "Potato", "Tomato", "Cucumber", "Cabbage"};
        double[] prices = {2, 1.5, 3, 2.5, 1};

        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();

        int productIndex = findProduct(products, product);
        if (productIndex == -1) {
            System.out.println("Product " + product + " not found");
        } else {
            System.out.println("Price is: " + prices[productIndex]);
        }
    }
}
