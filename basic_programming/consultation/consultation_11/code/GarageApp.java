/*
@date 02.05.2024
@author Sergey Bugaienko
*/

public class GarageApp {

    public static void main(String[] args) {

        BusDriver driver = new BusDriver(1, "John");

        System.out.println(driver.getBus());
        driver.driveBus();

        Bus bus = new Bus(driver, 3);

        System.out.println("Автобус знает о свеом водителе: " + bus.getDriver());
        System.out.println("Водитель тоже знает, что он в конкретном автобусе: " + driver.getBus());

        System.out.println("\n ===================== \n");
        bus.move();
        System.out.println("\n===Водитель управляет автобусом ");

        bus.setDriver(null);
        bus.move();
        System.out.println("Водитель все еще считает, что находится в автобусе: " + driver.getBus());
        driver.driveBus();

        BusDriver driver1 = new BusDriver(2, "Max");
        bus.setDriver(driver1);

        System.out.println("Автобус знает водителя: " + bus.getDriver());
        System.out.println("Водитель - уже знает, что попал в автобус: " + driver1.getBus());

//
//        bus.setDriver(driver1);
//
//        System.out.println(bus.toString());

        Passenger passenger = new Passenger("Max", 15);
        Passenger passenger1 = new Passenger("Hanna", 28);
        Passenger passenger2 = new Passenger("John", 34);
        Passenger passenger3 = new Passenger("Peter", 4);

        System.out.println(bus);

        System.out.println(bus.takePassenger(passenger));
        System.out.println(bus.takePassenger(passenger));

        System.out.println(bus.takePassenger(passenger1));
        System.out.println(bus.takePassenger(passenger2));
        System.out.println(bus.takePassenger(passenger3));

        System.out.println(bus.toString());

    }
}
