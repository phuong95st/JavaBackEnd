package basic.buoi4.abstractexample;

public class Square extends GeometricShape{
    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double getA() {
        return a;
    }

    @Override
    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double calculateArea() {
        return this.a * this.a;
    }
}
