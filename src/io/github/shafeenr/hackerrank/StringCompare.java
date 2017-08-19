package io.github.shafeenr.hackerrank;

import java.util.Scanner;

public class StringCompare {

    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        String scannerString = scanner.next();
        int k = scanner.nextInt();

        String max = scannerString.substring(0, k);
        String min = scannerString.substring(0, k);

        for (int i = 1; i <= scannerString.length() - k; i++) {
            if (min.compareTo(scannerString.substring(i, i + k)) > 0)
                min = scannerString.substring(i, i + k);
            if (max.compareTo(scannerString.substring(i, i + k)) < 0)
                max = scannerString.substring(i, i + k);

        }
        System.out.println(min);
        System.out.println(max);
    }

}
