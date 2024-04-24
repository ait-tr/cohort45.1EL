package classwork2404.example02;

import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        TrafficLightColor color = TrafficLightColor.YELLOW;

        //System.out.println(color);
        TrafficLightColor[] colors = TrafficLightColor.values();
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }
    }
}
