package be.vdab.OOOef24juni;

public class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle>{
    public ComparableRectangle(int width, int height) {
        super(width, height);
    }

    @Override
    public int compareTo(ComparableRectangle o) {
        if (getArea() > o.getArea()) return 1;
        else if (getArea() < o.getArea()) return -1;
        else return 0;
    }

    @Override
    public String toString() {
        return super.toString() + "Area: " + getArea();
    }
}
