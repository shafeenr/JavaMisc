package io.github.shafeenr.ics;
import java.util.Scanner;

public class TemperatureConvert {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String sTemp;
        double temp;
        double fTemp;
        
        System.out.println("Enter temperature to be converted in Celsius: ");
        sTemp = in.nextLine();
        temp = Double.parseDouble(sTemp);
        fTemp = 1.8 * temp + 32;
        
        System.out.printf("%.1f degrees C equals %.1f degrees F", temp, fTemp);
    }

}
