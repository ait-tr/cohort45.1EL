package classwork2204.example01;

public class Main {
    public static void main(String[] args) {
        Human maxim = new Human("Maxim", 19);
        Human anton = new Human("Anton", 30);
        //maxim.age = -10; // age is inaccessible

        Human.celebrateBirthday(maxim);
        Human.meet(maxim, anton);

    }
}
