package io.github.shafeenr.ics;
import java.util.Scanner;

public class P2 {
    
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.print("Enter radius of circle: ");
        int radius = in.nextInt();
        
        System.out.println("Circumference: " + (radius * 2) * Math.PI);
        System.out.println("Area: " + Math.PI * Math.pow(radius, 2));

    }

}
