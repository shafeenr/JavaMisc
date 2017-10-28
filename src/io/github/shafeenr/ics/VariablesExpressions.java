package io.github.shafeenr.ics;
public class VariablesExpressions {
    public static void main(String[] args) {
        // Step 1 - Declaring variables
        int x = 12;
        int y = 9;

        System.out.printf("the sum of %d and %d is %d\n", x, y, x + y);
        System.out.printf("the difference of %d and %d is %d\n", x, y, x - y);
        System.out.printf("the product of %d and %d is %d\n", x, y, x * y);
        /*
         * Result must be output as a floating point datatype
         * due to a fractional part (1.333) which would be presented as "1"
         * by int
         */
        System.out.printf("the quotient of %d and %d is %f\n", x, y, (float) x / y);       
        System.out.printf("the remainder of %d divided by %d is %d\n", x, y, x % y);

    }
}