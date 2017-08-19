package io.github.shafeenr.dailyprogrammer;

import java.util.Scanner;

public class SimplifyingFractions {

    private static Scanner in;

    public static void main(String[] args) {
        in = new Scanner(System.in);

        int n = in.nextInt();
        int d = in.nextInt();

        in.close();

        int GCD = findGCD(n, d);

        System.out.printf("%d %d", n / GCD, d / GCD);
    }

    private static int findGCD(int n, int d) {
        switch (d) {
            case (0):
                return n;
            default:
                return findGCD(d, n % d);
        }

    }

}