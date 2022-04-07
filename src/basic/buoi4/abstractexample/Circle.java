package basic.buoi4.abstractexample;

public class Circle extends GeometricShape{
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
    public double calculateArea() {
        return Math.PI * this.r;
    }
}
