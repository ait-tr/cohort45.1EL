package classwork2404.example02;

public enum TrafficLightColor {
    RED("Red", false),
    YELLOW("Yellow", false),
    GREEN("Green", true);

    private String colorName;
    private boolean canGo;

    TrafficLightColor(String colorName, boolean canGo) {
        this.colorName = colorName;
        this.canGo = canGo;
    }

    public String getColorName() {
        return colorName;
    }

    public boolean canGo() { // can go?
        return canGo;
    }

}
