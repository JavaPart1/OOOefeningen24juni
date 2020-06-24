package be.vdab.OOOef24juni;

public class Rectangle extends Shape {
    /*
    Maak een klasse Shape.
	Maak de overige klassen tot subklassen van de klasse Shape.
	Verplaats de eigenschappen van de x en y van de
	klassen Rectangle en Circle naar de klasse Shape.
	Verplaats ook de methoden voor het zetten en
	opvragen van de positie naar de klasse Shape.
	Maak in de klasse Shape de methode getCount() om
	het aantal figuren op te vragen.
	Maak een klasse Triangle en IsoscelesTriangle.
	De eigenschappen perpendicular is het punt waar
	de loodlijn de basis snijdt.
	Voor de berekening van oppervlakte en omtrek kan je
	gebruik maken van de klasse Math.
	Maak een nieuw hoofdprogramma waarin een aantal
	rechthoeken, vierkanten en cirkels gemaakt worden
	(ShapeApp.java) en waarbij de verschillende
	eigenschappen op het scherm worden afgedrukt.
     */
    public static final int ANGLES = 4;
    private int width;
    private int height;

    public Rectangle(Rectangle r) {
    }

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
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

    public double getArea(){
        return width * height;
    }
    public double getPerimeter(){
        return (width+height)*2;
    }

    public void grow(int d){}

    @Override
    public String toString() {
        return "Rectangle{" +
                "Angles=" + ANGLES +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}

