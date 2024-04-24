package classwork2404.example01;

public class Main {


    public static void main(String[] args) {
        Human mihail = new Human("Mihail", 3);
        Human olga = new Human("Olga", 2);

        System.out.println(mihail.getName());
        System.out.println(olga.getName());
        System.out.println("Species: " + mihail.species);
        olga.species = "Domestic cat";
        System.out.println("Species: " + mihail.species);

    }
}
