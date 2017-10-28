package io.github.shafeenr.ics;
import java.util.Scanner;

public class Grades {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String name;
        
        String firstSubject;
        String secondSubject;
        String thirdSubject;
        String fourthSubject;
        
        String sFirstMark;
        String sSecondMark;
        String sThirdMark;
        String sFourthMark;
        
        int firstMark;
        int secondMark;
        int thirdMark;
        int fourthMark;
        
        int average;

        System.out.println("Enter your name: ");
        name = in.nextLine();
        
        System.out.println("Enter your first subject: ");
        firstSubject = in.nextLine();
        
        System.out.println("Enter your mark for " + firstSubject + " ");
        sFirstMark = in.nextLine();
        firstMark = Integer.parseInt(sFirstMark);
        
        System.out.println("Enter your second subject: ");
        secondSubject = in.nextLine();
        
        System.out.println("Enter your mark for " + secondSubject + " ");
        sSecondMark = in.nextLine();
        secondMark = Integer.parseInt(sSecondMark);
        
        System.out.println("Enter your third subject: ");
        thirdSubject = in.nextLine();
        
        System.out.println("Enter your mark for " + thirdSubject + " ");
        sThirdMark = in.nextLine();
        thirdMark = Integer.parseInt(sThirdMark);
        
        System.out.println("Enter your fourth subject: ");
        fourthSubject = in.nextLine();
        
        System.out.println("Enter your mark for " + fourthSubject + " ");
        sFourthMark = in.nextLine();
        fourthMark = Integer.parseInt(sFourthMark);
        
        in.close();
        
        System.out.println("Name: " + name);
        System.out.println(firstSubject + " " + firstMark + "%");
        System.out.println(secondSubject + " " + secondMark + "%");
        System.out.println(thirdSubject + " " + thirdMark + "%");
        System.out.println(fourthSubject + " " + fourthMark + "%");
        
        System.out.println("Average: " + ((firstMark + secondMark + thirdMark + fourthMark) / 4));
    }

}
