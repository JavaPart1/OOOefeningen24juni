package be.vdab.OOOef24juni;

public class Testpgm136 {
    public static void main(String[] args) {
        ComparableCircle cc1 = new ComparableCircle(12);
        ComparableCircle cc2 = new ComparableCircle(13);

        ComparableRectangle cr1 = new ComparableRectangle(7,3);

        if (cc1.compareTo(cc2) == 1) System.out.println("cc1 groter");
        else if (cc1.compareTo(cc2) == -1) System.out.println("cc2 groter");
        else System.out.println("even groot");

    }
}
