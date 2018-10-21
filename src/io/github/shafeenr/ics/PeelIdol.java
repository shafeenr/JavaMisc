package io.github.shafeenr.ics;

import java.util.Scanner;

public class PeelIdol {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final String vowel = "eiouEIOU";
        String s = in.nextLine();
        int aCount = 0;
        int vowels = 0;

        for (char c : s.toCharArray()) {
            if (c == 'a') {
                aCount++;
            } else if (vowel.indexOf(c) != -1) {
                vowels++;
            }
        }
        System.out.println(aCount >= vowels ? "Advance to next round" : "Does not advance to next round");
    }
}
