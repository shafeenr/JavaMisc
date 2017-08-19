package io.github.shafeenr.dailyprogrammer;

import java.util.Scanner;

public class GameOfThrees {

    private static Scanner in;

    public static void main(String[] args) {
        in = new Scanner(System.in);
        int x = in.nextInt();
        in.close();

        while (x > 1) {
            switch (x % 3) {
                case 0:
                    System.out.println((x = x / 3) + 0);
                    break;
                case 1:
                    System.out.println((x = (x - 1) / 3) + " -1");
                    break;
                default:
                    System.out.println((x = (x + 1) / 3) + " 1");
                    break;
            }
        }

    }

}