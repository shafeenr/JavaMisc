
//**********************************************************
// Author: Shafeen Rahman 676669
//
// Assignment: J8C3
//
// Description: Copy the assignment requirements here
//
// Date Start: 02/11/18
// Date Completed: 04/11/18
//
// Completion time: 1.5 hours
//
// Honor Code: I pledge that this program represents my own
//   program code. I received help from nobody in designing and debugging my program.
//*********************************************************

package io.github.shafeenr.ics;

import java.util.ArrayList;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> alint = new ArrayList<Integer>();

        while (in.hasNextInt()) {
            int num = in.nextInt();
            if (num != 0) {
                alint.add(num);
            } else {
                in.close();
                break;
            }
        }

        for (int i = 0; i < alint.size(); i++) {
            int num = alint.get(i);
            int sum = 0;
            int counter = 0;
            ArrayList<Integer> results = new ArrayList<Integer>();
            results.add(num);

            while (!results.contains(sum)) {
                char[] numberArray = Integer.toString(num).toCharArray();
                for (char aNumberArray : numberArray) {
                    sum += factorial(Integer.parseInt(Character.toString(aNumberArray)));
                }
                results.add(sum);
                num = sum;
                sum = 0;
                counter++;
            }
            System.out.println(counter);
        }


    }

    public static int factorial(int number) {
        for (int i = number - 1; i > 0; i--) {
            number *= i;
        }
        return number;
    }

}



