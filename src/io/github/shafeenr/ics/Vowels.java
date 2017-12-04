package io.github.shafeenr.ics;

import java.util.Scanner;

public class Vowels {

    public static void main(String[] args) {
        final char[] VOWELS = { 'a', 'e', 'i', 'o', 'u' };
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your word: ");

        while (in.hasNextLine()) {
            String word = in.nextLine();
            int vowelCount = 0;
            int consonantCount = 0;

            if (word.equals("stop")) {
                break;
            } else {
                for (int x = 0; x <= word.length() - 1; x++) {
                    boolean isVowel = false;
                    char currentChar = Character.toLowerCase(word.charAt(x));
                    for (char c : VOWELS) {
                        if (currentChar == c) {
                            vowelCount++;
                            isVowel = true;
                        }
                    }
                    if (!isVowel) {
                        consonantCount++;
                    }
                }
            }
            System.out.println("Result: " + vowelCount + " vowels and " + consonantCount + " consonants");
        }
    }
}
