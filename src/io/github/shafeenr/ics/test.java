package io.github.shafeenr.ics;

public class test {
    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(factorial(7));
        System.out.println(factorial(1));
    }

    public static int factorial(int number) {
        int sum = number;
        for (int i = number - 1; i > 0; i--) {
            sum *= i;
        }
        return sum;
    }
}
