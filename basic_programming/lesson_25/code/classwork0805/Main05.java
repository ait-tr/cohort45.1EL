package classwork0805;

public class Main05 {
    public static void main(String[] args) {

        String res = "";
        long start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            res += '!';
        }
        long end = System.nanoTime();
        double time = (end - start) / 1_000_000.0;
        System.out.println(time);

        StringBuilder sb = new StringBuilder();
        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            sb.append('!');
        }
        end = System.nanoTime();
        time = (end - start) / 1_000_000.0;
        System.out.println(time);

    }
}
