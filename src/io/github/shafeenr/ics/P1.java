package io.github.shafeenr.ics;
import java.util.Scanner;

public class P1 {
    private static Scanner in = new Scanner(System.in);
            
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.print("Enter first integer value: ");
        int x = in.nextInt();
        System.out.print("Enter second integer value: ");
        int y = in.nextInt();
        
        System.out.printf("the sum of %d and %d is %d\n", x, y, x + y);
        System.out.printf("the difference of %d and %d is %d\n", x, y, x - y);
        System.out.printf("the product of %d and %d is %d\n", x, y, x * y);
        System.out.printf("the remainder of %d divided by %d is %d\n", x, y, x % y);
    }

}
