package io.github.shafeenr.hackerrank;

import java.util.Scanner;

public class LoopsII {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int loopAmount = scanner.nextInt();

        for (int i = 0; i < loopAmount; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            for (int j = 0; j < n; j++) {
                a = a + (int) Math.pow(2, j) * b;
                System.out.print(a + " ");
            }
            System.out.println("");
        }
        scanner.close();
    }
}
