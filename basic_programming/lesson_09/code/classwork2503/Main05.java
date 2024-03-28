package classwork2503;

public class Main05 {
    /*
    Заполнить массив первыми 10 числами степеней двойки
    Вывести массив в консоль
     */

    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.pow(2, i);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
