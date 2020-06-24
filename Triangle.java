package be.vdab.OOOef24juni;

public class Triangle extends Shape{
    public static final int ANGLES = 3;
    private int width;
    private int height;
    private int perpendicular;
    private int side1;
    private int side2;
    private int side3;

    public Triangle(String color, boolean filled, int side1, int side2, int side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        setCount(getCount() + 1);
        width = side2;
        height = side3;
    }

    public Triangle(Triangle t) {
    }

    public Triangle() {
    }

    public Triangle(int width, int height) {
        this.width = width;
        this.height = height;
        setCount(getCount() + 1);
    }

    public Triangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
        setCount(getCount() + 1);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getPerpendicular() {
        return perpendicular;
    }

    public void setPerpendicular(int perpendicular) {
        this.perpendicular = perpendicular;
    }

    @Override
    double getArea() {
        return width*height/2;
    }

    @Override
    double getPerimeter() {
        return (double) side1+side2+side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", kleur=" + getColor() +
                ", gevuld=" + isFilled() +
                ", omtrek=" + getPerimeter() +
                ", opp=" + getArea() +
                '}';
    }
}
