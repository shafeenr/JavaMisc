package io.github.shafeenr.codeeval;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lowercase {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File(args[0]));
        
        while (in.hasNextLine()) {
            System.out.println(in.nextLine().toLowerCase());
        }

    }

}
