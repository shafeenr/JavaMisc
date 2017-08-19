package io.github.shafeenr.hackerrank;

import java.util.Scanner;

public class StringsIntro {

    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        String A = scanner.next();
        String B = scanner.next();
        scanner.close();

        System.out.println(A.length() + B.length());

        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        A = Character.toUpperCase(A.charAt(0)) + A.substring(1);
        B = Character.toUpperCase(B.charAt(0)) + B.substring(1);
        System.out.println(A + " " + B);
    }
}
