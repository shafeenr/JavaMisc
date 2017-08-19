package io.github.shafeenr.dailyprogrammer;

import java.util.Scanner;

/**
 * Created by Shafeen Rahman on 2017-05-18.
 */
public class NumberOne {
    private static Scanner in;

    public static void main(String[] args) {
        in = new Scanner(System.in);

        String name = in.next();
        int age = in.nextInt();
        String username = in.next();

        in.close();

        System.out.printf("your name is %s, you are %d years old, and your username is %s", name, age, username);
    }
}
