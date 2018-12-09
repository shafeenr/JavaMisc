package io.github.shafeenr.ics;

import java.util.Arrays;
import java.util.Scanner;

public class matrixOperations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arrayOne = read(in.nextLine());
        int[][] arrayTwo = read(in.nextLine());
    }

    static int[][] add(int[][] x, int[][] y) {
        for (int row = 0; row < x.length; row++) {
            for (int col = 0; col < x[row].length; col++) {
                x[row][col] += y[row][col];
            }
        }
        return x;
    }

    static int[][] subtract(int[][] x, int[][] y) {
        for (int row = 0; row < x.length; row++) {
            for (int col = 0; col < x[row].length; col++) {
                x[row][col] -= y[row][col];
            }
        }
        return x;
    }

    static String print(int[][] x) {
        return Arrays.deepToString(x);
    }

    static int[][] read(String in) {
        Scanner text = new Scanner(in);
        int row = text.nextInt();
        int col = text.nextInt();

        int[][] x = new int[row][col];

        while (text.hasNextInt()) {
            for (int i = 0; i < row; i++) {
                for (int y = 0; i < col; i++) {
                    x[row][col] = text.nextInt();
                }
            }
        }

        return x;
    }

}
