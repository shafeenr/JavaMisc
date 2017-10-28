package io.github.shafeenr.ics;
import java.util.Scanner;

public class FavouriteFood {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String favoriteFood = in.nextLine();
        if (favoriteFood.equals("pizza")) {
            System.out.println("I like pizza too!");
        } else {
            System.out.println("I hate " + favoriteFood + "!");
        }

    }

}
