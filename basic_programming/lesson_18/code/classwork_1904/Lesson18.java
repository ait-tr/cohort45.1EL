package classwork_1904;
/*
@date 19.04.2024
@author Sergey Bugaienko
*/

public class Lesson18 {
    public static void main(String[] args) {



        Cat cat = new Cat(); // создаем объект класса Cat
        //Вызов конструктора.
        // 1. Физически создается объект в памяти
        // Инициализация полей объекта значениями

        cat.sayMeow();
        cat.run();
        cat.sleep();

        String catName = cat.name;
        System.out.println("Имя: " + catName);

        // При создании объекта класса все его поля инициализируются значениями по умолчанию.
        // Для числовых примитивных типов, в том числе char -> 0 / 0.0
        // boolean -> false
        // String (для ссылочных типов) -> null

        System.out.println("Color: " + cat.color);
        System.out.println("Age: " + cat.age);


        System.out.println("\n ====================== \n");

        Cat cat1 = new Cat("Max");
        //Был создан объект класса Cat
        // Имя (строка) которая была передана в конструктор было присвоено полю класса (name)

        System.out.println("Color cat1: " + cat1.color);
        System.out.println("Name cat1: " + cat1.name);

        System.out.println("\n ================== \n");

        Cat cat2 = new Cat("Diamond", "red");
        cat2.whoAmI();

        Cat cat3 = new Cat("Kratos", "black", 9);
        cat3.whoAmI();


        System.out.println("\n =========================== \n");
        Cat cat4 = cat3;

        cat4.whoAmI();

        cat3.age = 11;
        cat3.whoAmI();
        cat4.whoAmI();

        System.out.println("====== new Cat4 =============\n");
        cat4 = new Cat("Barsik", "white", 1);

        cat4.whoAmI();
        cat3.whoAmI();


//        cat3 = null; если раскомментировать - программа аварийно завершится в строке 68
        System.out.println(cat3.name);
        cat3.whoAmI();

        System.out.println("Continue program");





    }

}
