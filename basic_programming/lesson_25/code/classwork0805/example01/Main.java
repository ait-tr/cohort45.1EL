package classwork0805.example01;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Richard", 4);
        Cat cat = new Cat("Vasya", 3);

        dog.voice();
        dog.pet();
        dog.feed();
        dog.cleanUp();
        dog.goForAWalk();

        cat.voice();
        cat.pet();
        cat.feed();
        cat.cleanUp();

    }
}
