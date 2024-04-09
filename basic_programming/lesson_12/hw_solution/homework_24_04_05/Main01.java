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

public class Main01 {
    public static void main(String[] args) {
        String[] products = {"coffee", "tea", "butter", "sugar", "bun", "cocoa", "milk", "bread", "cheese", "salami"};
        float[] price = {8.99f, 7.99f, 2.49f, 1.79f, 0.59f, 7.39f, 1.99f, 2.99f, 3.49f, 2.09f};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select product : ");
        String product = scanner.nextLine();

        for (int i = 0; i < products.length; i++) {

            if (product.equalsIgnoreCase(products[i])) {
                System.out.println("Product  " + products[i] + "\nPrice  " + price[i] + "  $");
                System.out.println("Select product amount : ");  //  Выберите количество продукта
                int amount = scanner.nextInt();
                float totalPrice = amount * price[i];
                System.out.println("Product  " + products[i] + "\nPrice   " + price[i] +
                        "  $\nAmount  " + amount + "\nTotal price  " + totalPrice + "  $");
                break;
            }
        }

        for (int i = 0; i < products.length; i++) {
            if (!product.equalsIgnoreCase(products[i])) {
                System.out.println("There is no such product in the store!");
                break;
            }
        }

    }
}
