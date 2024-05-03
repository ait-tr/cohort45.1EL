/*
@date 02.05.2024
@author Sergey Bugaienko
*/

public class BusDriver {
    private  int id;
    private String name;
    private Bus bus;

    public BusDriver(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public String toString() {
        return "BusDriver{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void driveBus() {
        if (bus != null) {
            bus.move();
        } else {
            System.out.println("Я в отпуске. Сейчас не нахожусь в автобусе!");
        }
    }
}
