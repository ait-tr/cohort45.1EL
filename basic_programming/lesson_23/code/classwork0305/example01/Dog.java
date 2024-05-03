package classwork0305.example01;

public class Dog extends Pet {
    private double height;
    private DogProfession dogProfession;

    public Dog(String name, int age, String breed, double weight, double height, DogProfession dogProfession) {
        super(name, age, breed, weight);
        this.height = height;
        this.dogProfession = dogProfession;
    }

    public void bark() {
        System.out.println("Гав гав!");
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public DogProfession getDogProfession() {
        return dogProfession;
    }

    public void setDogProfession(DogProfession dogProfession) {
        this.dogProfession = dogProfession;
    }
}
