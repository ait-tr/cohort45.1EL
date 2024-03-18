package classwork1803;

public class Main02 {
    public static void main(String[] args) {
        int n = 5;
        int n1 = n++;

        System.out.println("n = " + n);
        System.out.println("n1 = " + n1);
        System.out.println();
        n = 5;
        int n2 = ++n;
        System.out.println("n = " + n);
        System.out.println("n2 = " + n2);
        System.out.println();
    }
}
