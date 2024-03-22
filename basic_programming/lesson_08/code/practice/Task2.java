package code.practice;

public class Task2 {
    /*
         Напечатать все простые числа от 2 до 100

     */

    public static void main(String[] args) {

        for (int checkNumber = 2; checkNumber <= 100; checkNumber++) {

            boolean isSimple = true;

            for (int i = 2; i < checkNumber; i++) {
                if (checkNumber % i == 0) {
                    isSimple = false;
                }
            }

            if (isSimple) {
                System.out.println("Число " + checkNumber + " является простым");
            }
        }
    }
}
