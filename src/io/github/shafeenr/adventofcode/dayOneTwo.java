package io.github.shafeenr.adventofcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class dayOneTwo {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("freq.txt"));
        ArrayList<Integer> sum = new ArrayList<Integer>();
        sum.add(Integer.parseInt(in.nextLine()));
        in.nextLine();
        while (in.hasNextLine()) {
            int num = Integer.parseInt(in.nextLine());
            if (sum.contains(num)) {
                System.out.println(num);
            } else {
                sum.add(sum.get(sum.size() - 1) + num);
            }
        }
        System.out.println(sum.get(sum.size() - 1));
    }
}