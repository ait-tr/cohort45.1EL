package staticDemo;/*
@date 23.04.2024
@author Sergey Bugaienko
*/

public class CarApp {

    public static void main(String[] args) {

        System.out.println("Статическое поле до создания объектов: " + Car.countCar);


        Car car = new Car("BMW", 700);
        Car car1 = new Car("Skoda", 140);

        System.out.println(car1.getModel());

        int count = Car.countCar;
        System.out.println("current counter: " + count);

        // System.out.println(car.countCar);
        // Обращаться к статическим полям нужно только от имени класса

        Car car2 = new Car("staticDemo.anonimous.Car", 140);
        System.out.println(car2.getModel());
        System.out.println(car2.getPower());

        System.out.println(Car.countCar);

        car.showInfo();
        car1.showInfo();
        car2.showInfo();





    }
}
