package io.github.shafeenr.hackerrank;

import java.util.Scanner;

public class OutputFormatting {

    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        String[] stringArray = new String[3];
        int[] intArray = new int[3];

        for (int i = 0; i < 3; i++) {
            stringArray[i] = scanner.next();
            intArray[i] = scanner.nextInt();
        }

        System.out.println("================================");

        for (int i = 0; i < 3; i++) {

            System.out.printf("%-15s", stringArray[i]);
            System.out.printf("%03d\n", intArray[i]);

        }
        System.out.println("================================");
    }

}
