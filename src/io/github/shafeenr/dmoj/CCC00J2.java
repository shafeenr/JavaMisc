package io.github.shafeenr.dmoj;

import java.util.Scanner;

public class CCC00J2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int start = in.nextInt();
        int end = in.nextInt();
        int count = 0;

        for (int i = start; i <= end; i++) {
            String oldString = Integer.toString(i);
            String newString = "";

            for (int x = oldString.length() - 1; x >= 0; x--) {
                if (oldString.charAt(x) == '0' || oldString.charAt(x) == '1' || oldString.charAt(x) == '8') {
                    newString += oldString.charAt(x);
                } else if (oldString.charAt(x) == '6') {
                    newString += '9';
                } else if (oldString.charAt(x) == '9') {
                    newString += '6';
                }
            }
            if (oldString.equals(newString)) {
                count++;
            }
        }
        System.out.println(count);
    }

}
