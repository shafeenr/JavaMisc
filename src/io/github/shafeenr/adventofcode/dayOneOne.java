package io.github.shafeenr.adventofcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class dayOneOne {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("freq.txt"));
        long sum = 0;
        while (in.hasNextLine()) {
            sum += Integer.parseInt(in.nextLine());
        }
        System.out.println(sum);
    }
}
