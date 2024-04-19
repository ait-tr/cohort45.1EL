package classwork_1904;
/*
@date 19.04.2024
@author Sergey Bugaienko
*/

public class Cat {
    String name;
    String color;
    int age;

    public Cat()  {

    }

    public Cat(String catName) {
        name = catName;
    }

    public Cat(String catName, String color) {
        name = catName;
        this.color = color;
        // Ключевое слово this используется внутри класса лоя ссылки на текущий объект
        // оно служит для разрешения конфликта имен между полями классам и параметрами методов / конструкторов
    }

    public Cat(String name, String color, int age) {
        this(name, color); // при помощи конструктора с двумя стрингами будет создан объект
        // соответсвующее поля проиннициализированны.

        // Ключевое слово this может использоваться для вызова других конструкторов класса
        // или для передачи текущего объекта в качестве параметра метода
        this.age = age;
    }

    public void sleep() {
        System.out.println("Я сплю!");
    }

    void run() {
        System.out.println("Я бегу!");
    }

    void sayMeow() {
        System.out.println("Meow!");
    }

    // перегрузка метода
    void sayMeow(String string) {
        System.out.println("Hello! Meow, " + string);
    }

    public void whoAmI() {
        System.out.println("Я котик " + name + ", мой возраст: "  +
                age + ", и мой окрас: " + color);
    }

}
