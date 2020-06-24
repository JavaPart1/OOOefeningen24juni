package be.vdab.OOOef24juni;

public class ShappApp {
    public static void main(String[] args) {
        /*
     	Maak een nieuw hoofdprogramma waarin een aantal
	    rechthoeken, vierkanten en cirkels gemaakt worden
	    (ShapeApp.java) en waarbij de verschillende
	    eigenschappen op het scherm worden afgedrukt.
         */
        System.out.println("Maak een rechthoek");
        Rectangle rect = new Rectangle(8,9);
        System.out.println(rect.toString());
        System.out.println("Maak een cirkel");
        Circle circ = new Circle(9);
        System.out.println(circ.toString());
        System.out.println("Maak een vierkant");
        Square vrknt = new Square(3);
        System.out.println(vrknt.toString());
    }
}
