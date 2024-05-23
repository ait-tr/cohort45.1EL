package consultation2305;

public class Cat {
    private String name;
    private int age;
    private double hairLen;
    private String eyeColor;

    public Cat() {

    }

    public Cat(String name, int age, double hairLen, String eyeColor) {
        this.name = name;
        this.age = age;
        this.hairLen = hairLen;
        this.eyeColor = eyeColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHairLen() {
        return hairLen;
    }

    public void setHairLen(double hairLen) {
        this.hairLen = hairLen;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }
}
