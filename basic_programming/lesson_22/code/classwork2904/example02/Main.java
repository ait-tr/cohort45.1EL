package classwork2904.example02;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Germany", "Berlin", "Weserstr. 48");

        Human human1 = new Human("Nico", address);
        Human human2 = new Human("Julie", address);

        human1.introduce();
        human2.introduce();
    }
}
