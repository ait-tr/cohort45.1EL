/*
@date 02.05.2024
@author Sergey Bugaienko
*/

/*
Bus has-a Driver
Bus has-a Autopilot
 */

import java.util.Arrays;

public class Bus {
    private static int counter;

    private final int id;
    private BusDriver driver; // HAS-A. Может существовать отдельно = Агрегация
    private AutoPilot autoPilot; // HAS-A. Существует только вместе с этим автобусом = композиция.


    private int capacity;

    private final Passenger[] passengers;
    private int countPassengers;

    public Bus(BusDriver driver, int capacity) {
        driver.setBus(this);
        this.driver = driver;
        this.autoPilot = new AutoPilot(1, "AP-005D");
        this.id = counter++;
        this.capacity = capacity;
        this.passengers = new Passenger[capacity];
    }

    public boolean takePassenger(Passenger passenger) {
        // Посадка пассажира в автобус:
        // Не пришел ли null? СЗаканчиваем работу методы с сообщением об ошибке.
        // 1. Есть ли место в автобусе?
        // 2. Находится ли УЖЕ этот пассажир в автобусе?
        // Проверки прошли:
        // Да.
        // 3.1. Посадить в автобус (добавить в массив) +
        // 3.2. Изменить кол-во пассажиров в автобусе +
        // 3.3. Изменить статус пассажира (поле isInBus)
        // Нет:
        // 4.1 - ничего не будем делать (выдать сообщение об ошибке)

        if (passenger == null) return false;

        if (countPassengers >= passengers.length) {
            System.out.println("Автобус переполнен");
            return false;
        }

        if (passenger.isInBus()) {
            System.out.println("Пассажир уже едет в каком-то автобусе");
            return false;
        }

        passengers[countPassengers++] = passenger; // Добавляем пассажира в автобус
        passenger.setInBus(true);
        return true;

            }

    public BusDriver getDriver() {
        return driver;
    }

    public void setDriver(BusDriver driver) {

        if (driver == null) {
            this.driver.setBus(null);
        } else {
            driver.setBus(this);
        }

        this.driver = driver;
    }

    public AutoPilot getAutoPilot() {
        return autoPilot;
    }

    public String toString() {
        return "Bus{" +
                "id=" + id +
                ", driver=" + driver +
                ", autoPilot=" + autoPilot +
                " Пассажиры"  + Arrays.toString(passengers) +
                '}';
    }

    public void move() {
        if (driver != null) {
            System.out.println("Водитель " + this.driver + " нажал на газ");
            System.out.println("Автобус двигается вперед!");
        } else  {
            System.out.println("Водителя нет, автобус остался на месте!");
        }
    }
}
