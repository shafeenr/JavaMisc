package io.github.shafeenr.waterlooccc;

import java.util.Scanner;

public class ShiftySums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        in.close();

        int result = 0;

        for (int i = 1; i < k + 1; i++) {
            result += (int) (n * (Math.pow(10, i)));
        }

        System.out.println(result + n);
    }
}
