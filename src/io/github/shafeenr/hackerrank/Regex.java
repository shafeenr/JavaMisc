package io.github.shafeenr.hackerrank;

import java.util.Scanner;

class Regex {
    private static Scanner in;

    public static void main(String[] args) {
        in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}

class MyRegex {
    String s = "([0-9]{1,2}|[0][0-9]{1,2}|[1][0-9]{1,3}|[2][0-5]{1,3})";
    String pattern = s + "." + s + "." + s + "." + s;
}