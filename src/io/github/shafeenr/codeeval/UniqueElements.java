package io.github.shafeenr.codeeval;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class UniqueElements {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File(args[0]));

        while (in.hasNextLine()) {
            String[] inputArray = in.nextLine().split(",");
            ArrayList<String> al = new ArrayList<String>();

            for (String s : inputArray) {
                if (!(al.contains(s))) {
                    al.add(s);
                }
            }
            System.out.println(al);
        }
    }

}
