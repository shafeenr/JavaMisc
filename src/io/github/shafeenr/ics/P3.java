package io.github.shafeenr.ics;
import java.util.Scanner;

public class P3 {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter kilometres: ");
        int km = in.nextInt();
        System.out.println(km * 0.62137 + " miles");

    }

}