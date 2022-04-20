package basic.buoi3.homework;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    // constructor
    public Ball(float x, float y, int radius, float xDelta, float yDelta) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    // getter, setter
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getxDelta() {
        return xDelta;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    // method
    public void move() {
        this.x += this.xDelta;
        this.y += this.yDelta;
    }

    public void reflectHorizontal() {
        this.xDelta = this.xDelta * (-1);
    }

    public void reflectVertical() {
        this.yDelta = this.yDelta * (-1);
    }

    public String toString(){
        return String.format("Ball(%.1f,%.1f),speed=(%.1f,%.1f)]",this.x, this.y, this.xDelta, this.yDelta);
    }

    public static void main(String[] args) {
        System.out.println(new Ball(1.1f,2.2f,0,3.3f,4.4f).toString());
        // Ball 2
        Ball ball2 = new Ball(80,35,0,4,6);
        System.out.println(ball2.toString());
        System.out.println("x is: "+ball2.getX());
        System.out.println("y is: "+ball2.getY());
        System.out.println("radius is: "+ball2.getRadius());
        System.out.println("xDelta is: "+ball2.getxDelta());
        System.out.println("yDelta is: "+ball2.getyDelta());
        ball2.move();
        System.out.println(ball2.toString());
        ball2.move();
        System.out.println(ball2.toString());
        ball2.reflectVertical();
        ball2.move();
        System.out.println(ball2.toString());
        ball2.move();
        System.out.println(ball2.toString());
        ball2.reflectHorizontal();
        ball2.move();
        System.out.println(ball2.toString());
        ball2.move();
        System.out.println(ball2.toString());
        ball2.move();
        System.out.println(ball2.toString());
        ball2.move();
        System.out.println(ball2.toString());
        ball2.move();
        System.out.println(ball2.toString());
        ball2.move();
        System.out.println(ball2.toString());
        ball2.reflectVertical();
        ball2.move();
        System.out.println(ball2.toString());
        ball2.move();
        System.out.println(ball2.toString());
        ball2.move();
        System.out.println(ball2.toString());
        ball2.move();
        System.out.println(ball2.toString());
        ball2.move();
        System.out.println(ball2.toString());
    }
}
