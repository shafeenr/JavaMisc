package io.github.shafeenr.ics;
import java.util.Scanner;

public class SequentialProgrammingReceipt {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Customer name: ");
        String customerName = in.nextLine();
        System.out.println("Item: ");
        String itemName = in.nextLine();
        System.out.println("Price of item: ");
        float priceOfItem = in.nextFloat();
        in.close();
        float HST =  (float) (priceOfItem * 0.13);
        
        System.out.println("\n**********");
        System.out.printf("%s\n%s", customerName, itemName);
        System.out.printf("\n$ %.2f price\n$ %.2f HST\n", priceOfItem, HST);
        System.out.println("**********");
        System.out.printf("$ %.2f Total", priceOfItem + HST);
    }

}
