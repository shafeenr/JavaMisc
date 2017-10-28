package io.github.shafeenr.ics;
import java.util.Scanner;

public class BiggerThanTen {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        if (in.nextDouble() < 10) {
            System.out.println("Your number was not greater than 10!");
        }
        System.out.println("The End.");
    }

}
