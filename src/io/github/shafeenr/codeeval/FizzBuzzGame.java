package io.github.shafeenr.codeeval;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FizzBuzzGame {

    private static Scanner scanner;

    public static void main(String[] args) throws FileNotFoundException {

        scanner = new Scanner(new File(args[0]));

        while (scanner.hasNextLine()) {
            Fizz(scanner.nextLine());
        }
    }

    public static void Fizz(String string) {

        int lineNumber = Integer.parseInt(string.split(" ")[0]);
        int fizzDividend = Integer.parseInt(string.split(" ")[1]);
        int buzzDividend = Integer.parseInt(string.split(" ")[2]);
        int countLimit = Integer.parseInt(string.split(" ")[3]);

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i <= countLimit; i++) {
            if (i % fizzDividend == 0) {
                stringBuilder.append("Fizz");
            }
            if (i % buzzDividend == 0) {
                stringBuilder.append("Buzz");
            } else {
                if (i % fizzDividend != 0) {
                    stringBuilder.append(i);
                }
            }
            if (i < countLimit) {
                stringBuilder.append(" ");
            }
        }

        System.out.println("Line " + lineNumber + ": " + stringBuilder.toString());
    }
}