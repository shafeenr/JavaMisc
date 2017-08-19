package io.github.shafeenr.hackerrank;

import java.util.Scanner;

public class Tokens {

    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        if (s.trim().length() == 0) {
            System.out.println(0);
        } else if (s.length() < 4 * Math.pow(10, 5)) {
            String[] sArray = s.trim().split("[ !,?._'@]+");
            System.out.println(sArray.length);

            for (String i : sArray) {
                System.out.println(i);
            }

        } else {
            System.out.println(0);
        }

    }
}