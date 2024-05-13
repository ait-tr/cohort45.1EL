package classwork0805.example01;

public class Fish extends Pet implements Petable {

    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public void feed() {
        System.out.println("(You throw some fish meal to aquarium)");
    }

    @Override
    public void cleanUp() {
        System.out.println("(You change dirty water)");
    }

    @Override
    public void pet() {
        System.out.println("(You pet the fish. Not too pleasant experience)");
    }
}
