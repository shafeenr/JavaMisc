package io.github.shafeenr.ics;

public class diceRoll {
    public static void main(String[] args) {
        int scale = 200;
        int[][] diceRolls = new int[2][11];

        for (int i = 0; i < diceRolls[0].length; i++) {
            diceRolls[0][i] = i + 2;
        }

        for (int i = 0; i < 100000; i++) {
            int num = diceRoll() + diceRoll();
            diceRolls[1][num - 2]++;
        }

        System.out.printf("\nScale: X = %d\n", scale);
        for (int i = 0; i < diceRolls[1].length; i++) {
            System.out.printf("%d\t", diceRolls[0][i]);
            int num = diceRolls[1][i] / scale;
            for (int x = 0; x < num; x++) {
                System.out.print("X");
            }
            System.out.printf(" %d\n", num);
        }
    }

    static int diceRoll() {
        int max = 6;
        int min = 1;

        return (int) (min + Math.random() * max);
    }
}
