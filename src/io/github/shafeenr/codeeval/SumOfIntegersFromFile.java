package io.github.shafeenr.codeeval;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SumOfIntegersFromFile {
    private static Scanner in;

    public static void main(String[] args) throws IOException {
        int sum = 0;
        in = new Scanner(new File(args[0]));

        while (in.hasNextInt()) {
            sum += in.nextInt();
        }

        System.out.println(sum);
    }
}
