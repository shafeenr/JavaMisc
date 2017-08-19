package io.github.shafeenr.projecteuler;

/**
 *
 * @author shafeenr
 */
public class Problem2 {

    public static void main(String[] args) {
        int x = 2;
        int y = 1;
        int z;
        int sum = 0;

        while (x < 4000000) {
            if (x % 2 == 0) {
                sum += x;
            }
            z = x;
            x += y;
            y = z;
        }
        System.out.println(sum);
    }
}
