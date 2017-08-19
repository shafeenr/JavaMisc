package io.github.shafeenr.dailyprogrammer;

import java.util.Scanner;

/**
 * Created by Shafeen Rahman on 2017-05-18.
 */
public class GuessingGame {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean foundNumber = false;
        int max = 101;
        int min = 1;
        while(!foundNumber) {
            int guess = (min + (max - min) / 2);
            System.out.printf("Is your number higher or lower than %d [h] higher [l] lower [e] equal\n", guess);
            String userGuess = in.nextLine();
            switch (userGuess) {
                case "h":
                    min = guess;
                    break;

                case "l":
                    max = guess;
                    break;

                case "e":
                    foundNumber = true;
            }
        }
        in.close();
    }
}
