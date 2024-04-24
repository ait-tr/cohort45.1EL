package staticDemo;/*
@date 23.04.2024
@author Sergey Bugaienko
*/

public class Car {
    private String model;
    private int power;
    static int countCar;

    // Константа.
    // Поле класса помеченное одновременно слова static и final называется константой.

    static final String PRODUCER = "BMW";

    public Car(String model, int power) {
        this.model = model;
        this.power = power;
        countCar++;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void showInfo() {
        System.out.println("Model: " + this.model + "; power: " + this.power);
        System.out.println("Producer: " + PRODUCER);
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
