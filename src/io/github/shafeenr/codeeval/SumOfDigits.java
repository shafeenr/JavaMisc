package io.github.shafeenr.codeeval;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SumOfDigits {
    private static Scanner in;

    public static void main(String[] args) throws IOException {
        in = new Scanner(new File(args[0]));
        int sum = 0;
        while (in.hasNextInt()) {
            int x = in.nextInt();
            String eggs = Integer.toString(x);
            for (int i = 0; i < eggs.length(); i++) {
                sum += Character.getNumericValue(eggs.charAt(i));
            }

        }
        System.out.println(sum);
    }

}
