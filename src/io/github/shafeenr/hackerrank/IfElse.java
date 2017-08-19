package io.github.shafeenr.hackerrank;

import java.util.Scanner;

public class IfElse {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x % 2 == 0) {
            if (x > 5) {
                if (x < 20) {
                    System.out.println("Weird");
                } else {
                    System.out.println("Not Weird");
                }
            } else {
                System.out.println("Not Weird");
            }
        } else {
            System.out.println("Weird");
        }
    }
}
