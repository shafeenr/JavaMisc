package io.github.shafeenr.sams;

import java.awt.Point;

public class PointSetter {
    public static void main (String[] args) {
        Point location = new Point(4, 13);

        System.out.println("Staring location:");
        System.out.println("X = " + location.x);
        System.out.println("Y = " + location.y);

        System.out.println("\nMoving to (7, 6)");
        location.x = 7;
        location.y = 6;

        System.out.println("X = " + location.x);
        System.out.println("Y = " + location.y);
    }
}
