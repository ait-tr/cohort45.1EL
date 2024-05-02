/*
@date 02.05.2024
@author Sergey Bugaienko
*/

public class Passenger {

    private String name;
    private int age;
    private boolean isInBus;

    public Passenger(String name, int age) {
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

    public boolean isInBus() {
        return isInBus;
    }

    public void setInBus(boolean inBus) {
        isInBus = inBus;
    }

    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
