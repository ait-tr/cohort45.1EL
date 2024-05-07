package animals;
/*
@date 07.05.2024
@author Sergey Bugaienko
*/

// Cat is-a Animal
public class Cat extends Animal {


    public Cat(String name) {
        super(name);
    }

    public void jump() {
        System.out.println("Cat jumping!");
    }

    // Динамический полиморфизм - переопределение метода
    @Override
    public void sound() {
        System.out.println("Cat say Meow!");
    }

    // Статический полиморфизм - перегрузка метода
    public void sound(String word) {
        System.out.println("I  can speak: " + word);
    }
}
