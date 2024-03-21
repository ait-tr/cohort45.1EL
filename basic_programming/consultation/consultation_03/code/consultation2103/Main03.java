package consultation2103;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String beast = scanner.nextLine();
        String dish = scanner.nextLine();

        boolean canBring = beast.charAt(0) == dish.charAt(0)
                && beast.charAt(beast.length() - 1) == dish.charAt(dish.length() - 1);
        System.out.println(canBring);

        String newBeast = beast.substring(0, 1) + beast.charAt(beast.length() - 1);
        String newDish = dish.substring(0, 1) + dish.charAt(dish.length() - 1);
        canBring = newBeast.equals(newDish);
        System.out.println(canBring);
    }
}
