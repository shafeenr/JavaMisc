package io.github.shafeenr.ics;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        while (in.hasNextLine()) {
            String[] newLine = in.nextLine().split(" ");
            double answer = 0;
            
            if (newLine[1].equals("+")) {
                answer = Double.parseDouble(newLine[0]) + Double.parseDouble(newLine[2]);
            } else if (newLine[1].equals("-")) {
                answer = Double.parseDouble(newLine[0]) - Double.parseDouble(newLine[2]);
            } else if (newLine[1].equals("*")) {
                answer = Double.parseDouble(newLine[0]) * Double.parseDouble(newLine[2]);
            } else if (newLine[1].equals("/")) {
                answer = Double.parseDouble(newLine[0]) / Double.parseDouble(newLine[2]);
            } else if (newLine[1].equals("^")) {
                answer = Math.pow(Double.parseDouble(newLine[0]), Double.parseDouble(newLine[2]));
            }
            
            System.out.printf("%s %s %s = %.2f\n", newLine[0], newLine[1], newLine[2], answer);
        }

    }

}
