package io.github.shafeenr.hackerrank;

import java.util.Scanner;

public class DataTypes {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        ;
        int testCases = scanner.nextInt();

        for (int i = 0; i < testCases; i++) {

            try {
                long x = scanner.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127) {
                    System.out.println("* byte");
                }
                if (x >= -32768 && x <= 32767) {
                    System.out.println("* short");
                }
                if (x >= -Math.pow(2, 31) && x <= (Math.pow(2, 31) - 1)) {
                    System.out.println("* int");
                }
                if (x >= -Math.pow(2, 63) && x <= (Math.pow(2, 63) - 1)) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }

        }
    }

}
