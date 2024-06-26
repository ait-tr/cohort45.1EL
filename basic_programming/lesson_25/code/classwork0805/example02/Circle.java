package classwork0805.example02;

public class Circle implements Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double getSquare() {
        return Math.PI * Math.pow(r, 2);
    }
}
