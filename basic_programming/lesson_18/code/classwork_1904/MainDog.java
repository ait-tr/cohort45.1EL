package classwork_1904;
/*
@date 19.04.2024
@author Sergey Bugaienko
*/

public class MainDog {
    public static void main(String[] args) {
        Dog dog = new Dog("Bim", 5);

        String info = dog.whoAmI();

        System.out.println(info);

        dog.run();
        dog.run();
        dog.run();
        dog.run();

        System.out.println(dog.whoAmI());
    }
}
