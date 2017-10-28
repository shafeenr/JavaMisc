package io.github.shafeenr.codeeval;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File(args[0]));
        
        while (in.hasNextLine()) {
            System.out.println(fibonacci(in.nextInt()));
        }
    }

    static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

}
