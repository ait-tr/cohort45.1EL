package animals;
/*
@date 07.05.2024
@author Sergey Bugaienko
*/

public class ZooApp {
    public static void main(String[] args) {

        Cat cat = new Cat("Max");

        cat.jump();
        cat.sound();

//        cat.sound();

        Dog dog = new Dog("Doggy");

//        dog.sound();

        Hamster hamster = new Hamster("Chrum");

        // Полиморфизм
        Animal[] animals = new Animal[4];
        animals[0] = cat;
        animals[1] = dog;
        animals[2] = hamster;
        animals[3] = new SuperCat("Super!");


        System.out.println("Animal ===========");

        for (int i = 0; i < animals.length; i++) {

            if (animals[i] instanceof Cat) {
                 Cat catNew = (Cat) animals[i];
                System.out.println("My name: " + catNew.getName());
            }

            animals[i].sound();
        }

        System.out.println("\n====== Method example ============= \n");

        playSound(cat);
        playSound(new SuperCat("superCat"));
        playSound(hamster);


        System.out.println("\n==== toString ==========\n");
        System.out.println(hamster);
    }

    public static void playSound(Animal animal) {
        animal.sound();
    }
}
