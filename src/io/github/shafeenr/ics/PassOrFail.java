package io.github.shafeenr.ics;

import java.util.Scanner;

public class PassOrFail {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        if (in.nextInt() > 50) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        System.out.println("The End.");
    }

}
