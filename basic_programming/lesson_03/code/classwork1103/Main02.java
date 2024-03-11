package classwork1103;

public class Main02 {
    public static void main(String[] args) {
        // Происходит потеря данных при явном сужающем преобразовании
        byte number = (byte)45.1;
        System.out.println(number);
    }
}
