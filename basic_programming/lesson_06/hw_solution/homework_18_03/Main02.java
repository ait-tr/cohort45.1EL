package homework_18_03;
    /*Программа, которую я установил дома в отопительной системе.
    Эта программа регулирует при помощи датчика температуры,
    температуру жидкости в отопительной системе,
    в зависимости от колебаний температуры воздуха на улице.
    */
import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the outside air temperature in degrees Celsius °С: ");
        float airTemperature = scanner.nextFloat();

        if (airTemperature < -10) {
            System.out.println("Heat the liquid to 60 °C");
        } else if (airTemperature < -5) {
            System.out.println("Heat the liquid to 55 °C");
        } else if (airTemperature < 0) {
            System.out.println("Heat the liquid to 50 °C");
        } else if (airTemperature < 5) {
            System.out.println("Heat the liquid to 45 °C");
        } else if (airTemperature < 10) {
            System.out.println("Heat the liquid to 40 °C");
        } else if (airTemperature < 20) {
            System.out.println("Heat the liquid to 35 °C");
        } else if (airTemperature < 25) {
            System.out.println("Heat the liquid to 30 °C");
        } else if (airTemperature >= 25) {
            System.out.println("Disable system");
        }
    }
}
