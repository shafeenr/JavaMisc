package io.github.shafeenr.codeeval;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class RightmostChar {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File(args[0]));
        
        while (in.hasNextLine()) {
            String s = in.nextLine();
            char t = s.charAt(s.indexOf(",") + 1);
            
            System.out.println(s.indexOf(t));
        }
        
    }

}
