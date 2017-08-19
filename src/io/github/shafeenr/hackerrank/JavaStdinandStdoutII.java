package io.github.shafeenr.hackerrank;

import java.util.Scanner;

public class JavaStdinandStdoutII {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        double y = scanner.nextDouble();
        scanner.nextLine();
        String z1 = scanner.nextLine();

        System.out.println("String: " + z1);
        System.out.println("Double: " + y);
        System.out.println("Int: " + x);
    }
}
