package io.github.shafeenr.ics;

import java.util.Scanner;

public class carefulReply {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int messages = Integer.parseInt(in.nextLine());

        for (int i = 0; i < messages; i++) {
            String s = in.nextLine();
            int count = 1;
            int last = -1;

            while ((s.indexOf("<3", last + 1) != -1)) {
                last = s.indexOf("<3", last + 1);
                count++;
            }

            for (int x = 0; x < count; x++) {
                System.out.print("<3 ");
            }
            System.out.println();
        }
    }
}
