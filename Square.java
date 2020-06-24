package be.vdab.OOOef24juni;

public class Square extends Rectangle{
    public Square() {
    }
    public Square(Square side) {
    }
    public Square(int side,int x,int y) {
    }
    public Square(int side) {
        setWidth(side);
        setHeight(side);
    }
    public int getSide(){
        return getWidth();
    }
    public void setSide(int side){}

    @Override
    public String toString() {
        return super.toString();
    }
}
