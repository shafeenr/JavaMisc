
//**********************************************************
// Author: Shafeen Rahman 676669
//
// Assignment: J8C1
//
// Description: Reverse inputs, add inputs, reverse inputs
//
// Date Start: 10/30/18
// Date Completed: 10/30/18
//
// Completion time: 1/2 hour
//
// Honor Code: I pledge that this program represents my own
//   program code. I received help from nobody
//   in designing and debugging my program.
//*********************************************************

package io.github.shafeenr.ics;

import java.util.Scanner;

public class AddRev {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int loops = in.nextInt();

        for (int i = 0; i < loops; i++) {
            int x = in.nextInt();
            int y = in.nextInt();

            System.out.println(reverseNum(reverseNum(x) + reverseNum(y)));

            // 34
            // 1998
            // 1

        }
    }

    static int reverseNum(int num) {
        int reverse = 0;
        for (; num > 0; num /= 10) {
            reverse = reverse * 10 + num % 10;
        }
        return reverse;
    }

}