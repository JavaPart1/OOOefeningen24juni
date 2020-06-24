package be.vdab.OOOef24juni;

public abstract class Shape {
    private static int count;
    private int x;
    private int y;

    public Shape() {
    }

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setPosition(int x,int y){
        this.x = x;
        this.y = y;
    }

    abstract double getArea();

    abstract double getPerimeter();
    public static int getCount() {
        return count;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
