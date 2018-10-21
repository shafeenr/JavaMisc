package io.github.shafeenr.ics;

import java.util.Scanner;

public class RPSF {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int roundsPlayed = in.nextInt();
        System.out.println();

        for (int i = 0; i < roundsPlayed; i++) {
            String s = in.nextLine();
            if (s.equals("Foxen")) {
                break;
            } else if (s.equals("Rock")) {
                System.out.println("Paper");
            } else if (s.equals("Paper")) {
                System.out.println("Scissors");
            } else if (s.equals("Scissors")) {
                System.out.println("Rock");
            } else if (s.equals("Fox")) {
                System.out.println("Foxen");
            }
        }
    }
}
