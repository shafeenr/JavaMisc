package io.github.shafeenr.codeeval;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RealFake {
    private static Scanner scanner;

    public static void main(String[] args) throws FileNotFoundException {
        scanner = new Scanner(new File(args[0]));

        while (scanner.hasNextLine()) {
            String credit = scanner.nextLine();
            credit = credit.replaceAll("\\s+", "");
            int[] creditArray = new int[16];

            for (int i = 0; i < creditArray.length; i++) {
                creditArray[i] = Character.getNumericValue(credit.charAt(i));
            }

            int doubledNumberSum = 0;
            int nonDoubledNumberSum = 0;

            for (int i = 0; i < creditArray.length; i = i + 2) {
                creditArray[i] = creditArray[i] * 2;
                doubledNumberSum = doubledNumberSum + creditArray[i];
                nonDoubledNumberSum = nonDoubledNumberSum + creditArray[i + 1];
            }

            if ((doubledNumberSum + nonDoubledNumberSum) % 10 == 0) {
                System.out.println("Real");
            } else {
                System.out.println("Fake");
            }
        }
    }
}
