package classwork2204.example01;

public class Human {
    public static final String SPECIES = "Homo sapiens";

    private String name;
    private int age;

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
        if (age >= 0) {
            this.age = age;
        }
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + name + ", and im " + age + " old!");
    }

    public static void celebrateBirthday(Human human) {
        System.out.println(human.name + " celebrating birthday!");
        human.age++;
        //human.setAge(human.getAge() + 1);
        System.out.println("He is now " + human.age + " years old!");
    }

    public static void meet(Human h1, Human h2) {
        System.out.println(h1.name + " and " + h2.name + " meet!");
        h1.sayHello();
        h2.sayHello();
    }
}
