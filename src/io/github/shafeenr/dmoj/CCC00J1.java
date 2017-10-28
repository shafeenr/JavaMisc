package io.github.shafeenr.dmoj;

import java.util.Scanner;

public class CCC00J1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int start = in.nextInt();
        int end = in.nextInt();

        String[] daysOfWeek = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };

        for (String s : daysOfWeek) {
            System.out.print(s + " ");
        }

        System.out.println();

        for (int i = start - 1; i > 0; i--) {
            System.out.print("    ");
        }

        for (int i = 1; i <= end; i++) {
            if (start % 7 == 0) {
                System.out.println("  " + i);
                start = 1;
            } else {
                System.out.print("  " + i);
                start++;
            }
        }
    }
}
