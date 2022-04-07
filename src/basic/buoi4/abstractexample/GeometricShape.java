package basic.buoi4.abstractexample;

public abstract class GeometricShape {
    private double A;

    private Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getA() {
        return A;
    }

    public void setA(double A) {
        this.A = A;
    }

    public abstract double calculateArea();

}
