package io.github.shafeenr.codeeval;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MultiplesOfANumber {
    private static Scanner scanner;

    public static void main(String[] args) throws FileNotFoundException {
        scanner = new Scanner(new File(args[0]));
        while (scanner.hasNextLine()) {
            multiple(scanner.nextLine());
        }
    }

    public static void multiple(String string) {
        int x = Integer.parseInt(string.split(",")[0]);
        int y = Integer.parseInt(string.split(",")[1]);
        int z = 1;

        while (z < y) {
            if ((y * z) > x) {
                System.out.println(y * z);
                break;
            } else {
                z++;
            }
        }
    }
}