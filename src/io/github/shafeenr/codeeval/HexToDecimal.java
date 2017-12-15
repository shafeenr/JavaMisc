package io.github.shafeenr.codeeval;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class HexToDecimal {

    public static void main(String[] args) throws IOException {
        //Scanner in = new Scanner(new File(args[0]));
        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {
            String[] lineBuffer = in.nextLine().toUpperCase().split("");
            int sum = 0;

            for (int i = 0; i < lineBuffer.length; i++) {
                if (lineBuffer[i].equals("A")) {
                    lineBuffer[i] = "10";
                } else if (lineBuffer[i].equals("B")) {
                    lineBuffer[i] = "11";
                } else if (lineBuffer[i].equals("C")) {
                    lineBuffer[i] = "12";
                } else if (lineBuffer[i].equals("D")) {
                    lineBuffer[i] = "13";
                } else if (lineBuffer[i].equals("E")) {
                    lineBuffer[i] = "14";
                } else if (lineBuffer[i].equals("F")) {
                    lineBuffer[i] = "15";
                }
            }
            
            for (int x = lineBuffer.length - 1; x > 0; x--) {
                sum += Integer.parseInt(lineBuffer[x]) * Math.pow(16, lineBuffer.length - 1 - x);
            }
            
            System.out.println(sum);
        }
    }

}
