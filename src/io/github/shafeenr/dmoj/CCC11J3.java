package io.github.shafeenr.dmoj;

import java.util.Scanner;

public class CCC11J3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();
        int b = in.nextInt();
        int c;
        int count = 2;
        
        while (a >= b) { 
            c = a - b;
            a = b;
            b = c;
            count++;
        }
        System.out.println(count);

    }

}
