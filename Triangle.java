package be.vdab.OOOef24juni;

public class Triangle extends Shape{
    public static final int ANGLES = 3;
    private int width;
    private int height;
    private int perpendicular;

    public Triangle(Triangle t) {
    }

    public Triangle() {
    }

    public Triangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Triangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
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
        return 0;
    }

    @Override
    double getPerimeter() {
        return 0;
    }
}
