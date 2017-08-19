package io.github.shafeenr.hackerrank;

import java.util.Scanner;

public class EndofFile {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int lines = 0;

        while (scanner.hasNextLine()) {
            lines++;
            System.out.println(lines + scanner.nextLine());
        }

    }

}
