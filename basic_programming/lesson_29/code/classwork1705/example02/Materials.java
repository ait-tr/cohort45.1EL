package classwork1705.example02;

public enum Materials {
    GLASS(0),
    PLASTIC(1),
    ALUMINUM(2),
    STEEL(3);

    private final int strength;

    Materials(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }
}
