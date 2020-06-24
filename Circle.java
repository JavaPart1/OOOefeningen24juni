package be.vdab.OOOef24juni;

public class Circle extends Shape {
    // nutteloze variabele?
    public final static int ANGLES = 0;
    // de math klasse heeft een PI constante reeds ingebouwd. 'Math.PI'
    public final double PI = 3.14;
    private int radius;

    public Circle(Circle c) {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public Circle() {
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double getArea(){
        return PI*Math.pow(radius,2);
    }
    public double getPerimeter(){
        return 2*radius*PI;
    }
    // implementatie?
    public void grow(int d){}

    @Override
    public String toString() {
        return "Circle{" +
                "ANGLES=" + ANGLES +
                ", PI=" + PI +
                ", radius=" + radius +
                '}';
    }
}
