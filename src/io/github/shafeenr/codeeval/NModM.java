package io.github.shafeenr.codeeval;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class NModM {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File(args[0]));

        while (in.hasNextLine()) {
            String input = in.nextLine();
            int x = Integer.parseInt(input.split(",")[0]);
            int y = Integer.parseInt(input.split(",")[1]);

            System.out.println(x - ((x / y) * y));
        }
    }

}