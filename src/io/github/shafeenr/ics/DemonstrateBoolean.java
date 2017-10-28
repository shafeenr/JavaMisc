package io.github.shafeenr.ics;

public class DemonstrateBoolean {
    public static void main(String[] args) {
        System.out.println(-5 == 7);
        System.out.println(7 == 7);
        System.out.println(5 <= 7);
        System.out.println(7 <= 5);
        System.out.println(-5 < 7);
        System.out.println(8 < 7);
        System.out.println(-5 >= 7);
        System.out.println(15 >= 7);
        System.out.println(15 > 7);
        System.out.println(-5 > -7);
        System.out.println(-5 > 7);
        System.out.println(7 < 7);
        System.out.println(-5 > -5);
        System.out.println(-5 != 7);
        System.out.println(-5 != -5);
        System.out.println(-5 != -(-5));
        System.out.println(!(8 == 8));
        System.out.println(!(8 == 9));
        System.out.println("hello".equals("hello"));
        System.out.println(("hello".equals("goodbye")));
        System.out.println(!("hello".equals("goodbye")));
        System.out.println(!("goodbye".equals("goodbye")));
    }
}
