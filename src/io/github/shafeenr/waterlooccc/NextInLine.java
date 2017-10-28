package io.github.shafeenr.waterlooccc;

import java.util.Scanner;

public class NextInLine {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int ageX = in.nextInt();
        int ageY = in.nextInt();

        System.out.println(ageY + (ageY - ageX));

    }

}
