package anonimous;/*
@date 25.05.2024
@author Sergey Bugaienko
*/

import java.util.*;

public class CarApp {
    public static void main(String[] args) {
        Car[] cars = new Car[7];

        cars[0] = new Car("Alfa", 2021, 120);
        cars[5] = new Car("Alfa", 2019, 140);
        cars[6] = new Car("Alfa", 2019, 250);
        cars[1] = new Car("BMW", 2000, 190);
        cars[2] = new Car("Citroen", 2018, 190);
        cars[4] = new Car("Dodge", 2023, 205);
        cars[3] = new Car("Ferrari", 2021, 300);

        System.out.println(Arrays.toString(cars));

        int[] ints = {9, 5, 1, 2, 5, 3, 0};
        Arrays.sort(ints);

        System.out.println(Arrays.toString(ints));

        Arrays.sort(cars);
        System.out.println(Arrays.toString(cars));

        CarSpeedComparator carSpeedComparator = new CarSpeedComparator();
        CarYearComparator carYearComparator = new CarYearComparator();

        Arrays.sort(cars, carYearComparator);

        System.out.println(Arrays.toString(cars));

        Comparator<Car> carComparator = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return 0;
            }
        };


        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car1.getModel().compareTo(car2.getModel());
            }
        });

        System.out.println(Arrays.toString(cars));

        Arrays.sort(cars, (car1, car2) -> car1.getYear() - car2.getYear());

        Arrays.sort(cars, Comparator.comparing(Car::getModel)
                .thenComparing(Car::getYear)
                .thenComparing(Comparator.comparing(Car::getMaxSpeed).reversed()));
//                .thenComparing(anonimous.Car::getMaxSpeed));

        System.out.println(Arrays.toString(cars));




    }
}
