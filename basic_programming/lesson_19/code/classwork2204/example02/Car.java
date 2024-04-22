package classwork2204.example02;

public class Car {
    // доп задача: доказать, что это присвоение действительно будет происходить во время вызова конструктора
    // (можно на другом, более простом примере)
    double fuelVolume = 0; // объем топлива в литрах
    double maxFuelVolume; // объем бака
    double mileage = 0; // пробег в километрах
    double fuelConsumption; // расход топлива на 100 км

    Car(double maxFuelVolume, double fuelConsumption) {
        this.maxFuelVolume = maxFuelVolume;
        this.fuelConsumption = fuelConsumption;
    }

    // метод для заправки автомобиля
    void refuel(double liters) {
        if (fuelVolume + liters > maxFuelVolume) {
            fuelVolume = maxFuelVolume;
        } else {
            fuelVolume += liters;
        }
    }

    boolean go(double kilometers) {
        // Рассчитываем, сколько топлива потребуется
        double fuelNeeded = (kilometers * fuelConsumption) / 100;

        // Проверяем, хватит ли топлива для поездки
        if (fuelVolume >= fuelNeeded) {
            fuelVolume -= fuelNeeded; // Уменьшаем объем
            mileage += kilometers; // Увеличиваем пробег
            return true; // Поездка завершилась успешно
        } else {
            return false; // Не хватило топлива для поездки
        }
    }


}
