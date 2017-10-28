package io.github.shafeenr.ics;
import java.util.Scanner;

public class AreaOfTriangle {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        double base;
        double height;
        double area;
        String sBase;
        String sHeight;

        System.out.print("Enter the base: ");
        sBase = in.nextLine();
        System.out.print("Enter the height: ");
        sHeight = in.nextLine();
        
        base = Double.parseDouble(sBase);
        height = Double.parseDouble(sHeight);
        
        area = (base * height)/2;
        
        System.out.println("base = " + base);
        System.out.println("height = " + height);
        System.out.println("area = " + area);
    }

}
