package io.github.shafeenr.hackerrank;

import java.util.Scanner;

public class Substrings {

    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        String scannerString = scanner.next();
        int beginIndex = scanner.nextInt();
        int endIndex = scanner.nextInt();

        System.out.println(scannerString.substring(beginIndex, endIndex));
    }
}