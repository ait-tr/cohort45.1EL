package homework_24_04_05;
/*
Сделать симуляцию кассы , где пользователь пишет название продукта и получает его цену.
Для этого создать массив продуктов и массив цен.
Запросить у пользователя название продукта. Если такого продукта нет в массиве продуктов,
вывести сообщение :  " такого продукта в магазине нет " .
Если продукт есть, вывести его цену.
Доп. задание : полбзователь также вводит количество продукта,
которое ему нужно.
Цена расчитывается с учётом количества.
 */

import java.util.Scanner;

public class Main02 {

    public static int findProduct(String[] products, String product) {
        for (int i = 0; i < products.length; i++) {
            if (product.equalsIgnoreCase(products[i])) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] products = {"coffee", "tea", "butter", "sugar", "bun", "cocoa", "milk", "bread", "cheese", "salami"};
        float[] prices = {8.99f, 7.99f, 2.49f, 1.79f, 0.59f, 7.39f, 1.99f, 2.99f, 3.49f, 2.09f};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите продукт: ");
        String product = scanner.nextLine();
        int productIndex = findProduct(products, product);
        if (productIndex == -1) {
            System.out.println("Продукт " + product + " не найден");
        } else {
            System.out.println("Цена: " + prices[productIndex] + " $");
            System.out.println("Выберите количество продукта: ");
            int amount = scanner.nextInt();
            float totalPrice = amount * prices[productIndex];
            System.out.println("Сумма к оплате: " + totalPrice + " $");
        }
    }
}