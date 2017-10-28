package io.github.shafeenr.ics;
import java.util.Scanner;

public class Discriminant {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        
        int discriminant = (int) (Math.pow(b, 2) - 4 * (a * c));
        
        if (discriminant > 0) {
            System.out.println("Two roots");
        } else if (discriminant < 0) {
            System.out.println("No real roots");
        } else {
            System.out.println("One root");
        }

    }

}
