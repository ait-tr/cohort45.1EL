package classwork2404.example01;

public class Human {
    public static String species;
    private String name;
    private int age;

    static {
        species = "Homo Sapiens";
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
