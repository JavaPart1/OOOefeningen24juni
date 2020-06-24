package be.vdab.OOOef24juni;

import java.util.Arrays;

public class SortRectangles {
    public static void main(String[] args) {
        ComparableRectangle[] rectngles = new ComparableRectangle[]{
                new ComparableRectangle(3, 5),
                new ComparableRectangle(13, 55),
                new ComparableRectangle(7, 35),
                new ComparableRectangle(1, 25),
                new ComparableRectangle(2541, 1000)
        };
        Arrays.sort(rectngles);
        for (ComparableRectangle rectngle : rectngles) {
            System.out.println(rectngle + " ");
            System.out.println();

        }
    }
}
