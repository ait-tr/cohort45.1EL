package classwork1705.example02;

public class Bottle implements Comparable<Bottle> {
    private Materials material;
    private double litres;

    public Bottle(Materials material, double litres) {
        this.material = material;
        this.litres = litres;
    }

    public Materials getMaterial() {
        return material;
    }

    public double getLitres() {
        return litres;
    }

    @Override
    public int compareTo(Bottle o) {
        if (this.litres > o.litres) {
            return 1;
        } else if (this.litres < o.litres) {
            return -1;
        }
        return 0;
    }
}
