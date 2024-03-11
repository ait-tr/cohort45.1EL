package classwork1103;

public class Main04 {
    public static void main(String[] args) {
        short sNumber = (short)0b11101000_11001101; // -5939
        // lossy conversion
        // В number уже будет только 11001101
        byte number = (byte)sNumber;

        System.out.println(sNumber);
        System.out.println(number);
    }
}
