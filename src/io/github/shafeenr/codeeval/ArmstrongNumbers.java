package io.github.shafeenr.codeeval;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ArmstrongNumbers {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File(args[0]));
        while (in.hasNextLine()) {
            String s = in.nextLine();
            
            String[] numberArray = s.split("");
            int sum = 0;
            
            for (String str : numberArray) {
                sum += Math.pow(Integer.parseInt(str), numberArray.length);
            }
            
            System.out.println(sum == Integer.parseInt(s));
        }
               
    }

}
