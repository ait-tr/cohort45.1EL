package classwork0605.homework22;

public class Main {
    public static void main(String[] args) {
        Tv tv = new Tv(10);
        Remote remote = new Remote(10);

        remote.channelForward(tv);
        System.out.println("Current channel: " + tv.getCurrentChannel());
        remote.switchChannel(tv, 11);
        System.out.println("Current channel: " + tv.getCurrentChannel());
        remote.channelBackward(tv);
        System.out.println("Current channel: " + tv.getCurrentChannel());
    }
}
