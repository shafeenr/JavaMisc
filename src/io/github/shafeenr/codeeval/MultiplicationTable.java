package io.github.shafeenr.codeeval;

public class MultiplicationTable {

    public static void main(String[] args){
        for (int a = 1; a <= 12; a++) {
            System.out.println();
            for (int b = 1; b <= 12; b++) {
                System.out.print("    " + (a * b));
            }
        }
    }

}
