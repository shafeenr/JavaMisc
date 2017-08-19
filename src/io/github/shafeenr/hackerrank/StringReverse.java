package io.github.shafeenr.hackerrank;

import java.util.Scanner;

public class StringReverse {

    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        String initial = scanner.nextLine();

        if (initial.equals(new StringBuilder(initial).reverse().toString())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
