package io.github.shafeenr.ics;
import java.util.Scanner;

public class HoursToDays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int hours = in.nextInt();
        
        System.out.printf("%d hours = %d days and %d hours", hours, hours / 24, hours % 24);
    }

}
