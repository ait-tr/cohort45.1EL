package code.whileLoop;

public class Example1Loop {
    public static void main(String[] args) {

        int x = 5;
        int y = 10;
        int result;

        int counter = 0;

        while (counter < 3) {
          x = x + 5;
          y = y + 10;
          result = x * y;
          System.out.println("Результат умножения x * y = " + result);

          counter++;
        }

        System.out.println("Программа завершена успешно");



    }
}
