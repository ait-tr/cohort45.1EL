package classwork0805.example01;

public class Cat extends Pet implements Voiceable, Petable {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void feed() {
        System.out.println("(You put some cat food in plate)");
    }

    @Override
    public void cleanUp() {
        System.out.println("(You clean up litter box)");
    }

    @Override
    public void voice() {
        System.out.println("meow!");
    }

    @Override
    public void pet() {

    }
}
