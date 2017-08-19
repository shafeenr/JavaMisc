package io.github.shafeenr.hackerrank;

import java.util.Scanner;

public class Anagrams {
    static boolean isAnagram(String a, String b) {

        if (a.length() != b.length()) {
            return false;
        } else {
            int[] intArray = new int[51];
            char[] aArray = a.toCharArray();
            char[] bArray = b.toCharArray();
            for (int i = 0; i < a.length(); i++) {
                intArray[Character.toLowerCase(aArray[i]) - 'a']++;
                intArray[Character.toLowerCase(bArray[i]) - 'a']--;
            }

            for (int i = 0; i < 26; i++) {
                if (intArray[i] != 0)
                    return false;
            }
            return true;
        }

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
