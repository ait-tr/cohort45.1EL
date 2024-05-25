package anonimous;/*
@date 25.05.2024
@author Sergey Bugaienko
*/

public class Car  implements Comparable<Car> {
    private String model;
    private  int year;
    private int maxSpeed;

    public Car(String model, int year, int maxSpeed) {
        this.model = model;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "anonimous.Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    // условия для сравнения. Отсортируйте машины по имени модели в порядке возрастание
    // и если модели совпадают - отсортировать в порядке убывания года выпуска

@Override
public int compareTo(Car car) {
    int result =  model.compareTo(car.getModel());
    if (result != 0) return result; // вернется число, не равное 0
    return this.year - car.getYear();
}
}