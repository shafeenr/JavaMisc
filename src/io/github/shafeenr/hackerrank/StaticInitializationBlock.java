package io.github.shafeenr.hackerrank;

import java.util.Scanner;

public class StaticInitializationBlock {
    static Scanner sc = new Scanner(System.in);
    static boolean flag = true;
    static int B;
    static int H;

    static {
        B = sc.nextInt();
        H = sc.nextInt();
        if (B <= 0 || H <= 0) {
            System.out.print("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }
}
