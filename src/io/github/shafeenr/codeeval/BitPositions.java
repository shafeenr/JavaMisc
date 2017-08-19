package io.github.shafeenr.codeeval;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BitPositions {
    private static Scanner scanner;

    public static void main(String[] args) throws FileNotFoundException {
        scanner = new Scanner(new File(args[0]));

        while (scanner.hasNextLine()) {
            binary(scanner.nextLine());
        }
    }

    public static void binary(String string) {
        String x = Integer.toBinaryString(Integer.parseInt(string.split(",")[0]));
        int y = Integer.parseInt(string.split(",")[1]);
        int z = Integer.parseInt(string.split(",")[2]);

        if (Integer.parseInt(x.split("")[x.length() - y + 1]) == Integer.parseInt(x.split("")[x.length() - z + 1])) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
