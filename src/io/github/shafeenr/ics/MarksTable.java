package io.github.shafeenr.ics;

import java.io.*;
import java.util.*;

public class MarksTable {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("classMarks.txt"));
        double[][] dataTable = new double[10][4];

        while (in.hasNext()) {
            int row = in.nextInt();

            for (int i = 0; i < 4; i++) {
                dataTable[row][i] = in.nextInt();
            }
        }

        for (int row = 0; row < dataTable.length; row++) {
            double sum = 0;
            for (int col = 0; col < dataTable[row].length; col++) {
                System.out.printf("%.0f ", dataTable[row][col]);
                sum += dataTable[row][col];
            }
            sum /= dataTable[row].length;
            System.out.printf("student %d avg %.1f\n", row, sum);
        }

        for (int col = 0; col < dataTable[0].length; col++) {
            double sum = 0;
            for (int row = 0; row < dataTable.length; row++) {
                sum += dataTable[row][col];
            }
            System.out.printf("%.1f ", sum / dataTable.length);
        }
        System.out.println("assessment averages");

        for (int col = 0; col < dataTable[0].length; col++) {
            int min = Integer.MAX_VALUE;
            for (int row = 0; row < dataTable.length; row++) {
                min = (int) Math.min(min, dataTable[row][col]);
            }
            System.out.printf("%d ", min);
        }
        System.out.println("assessment minimums");

        for (int col = 0; col < dataTable[0].length; col++) {
            int max = Integer.MIN_VALUE;
            for (int row = 0; row < dataTable.length; row++) {
                max = (int) Math.max(max, dataTable[row][col]);
            }
            System.out.printf("%d ", max);
        }
        System.out.println("assessment maximums");
    }
}
