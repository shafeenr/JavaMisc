package io.github.shafeenr.hackerrank;

import java.util.Scanner;

public class Loops {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", x, i, x * i);
        }

    }

}
