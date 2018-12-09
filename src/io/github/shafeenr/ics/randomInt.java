package io.github.shafeenr.ics;

public class randomInt {
    public static void main(String[] args) {
        int[][] randomNums = new int[2][10];

        for (int i = 0; i < randomNums[0].length; i++) {
            randomNums[0][i] = i;
        }

        for (int i = 0; i < 100; i++) {
            int num = randomInt();
            randomNums[1][num / 10]++;
        }

        for (int i = 0; i < randomNums[1].length; i++) {
            System.out.printf("%d0 %d9\t", randomNums[0][i], randomNums[0][i]);
            for (int x = 0; x < randomNums[1][i]; x++) {
                System.out.print("X");
            }
            System.out.printf(" %d\n", randomNums[1][i]);
        }
    }

    static int randomInt() {
        return (int) (Math.random() * 100);
    }
}
