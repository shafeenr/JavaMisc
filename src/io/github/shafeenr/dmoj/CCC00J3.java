package io.github.shafeenr.dmoj;

import java.util.Scanner;

public class CCC00J3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int coinsLeft = in.nextInt();
        int machineOne = in.nextInt();
        int machineTwo = in.nextInt();
        int machineThree = in.nextInt();        
        int count = 0;
        
        while (coinsLeft != 0) {
            machineOne++;
            coinsLeft--;
            count++;
            if (machineOne == 35) {
                coinsLeft += 30;
                machineOne = 0;
            }
            
            if (coinsLeft == 0) {
                break;
            }
            
            machineTwo++;
            coinsLeft--;
            count++;
            if (machineTwo == 100) {
                coinsLeft += 60;
                machineTwo = 0;
            }
            
            if (coinsLeft == 0) {
                break;
            }
            
            machineThree++;
            coinsLeft--;
            count++;
            if (machineThree == 10) {
                coinsLeft += 9;
                machineThree = 0;
            }
            
            if (coinsLeft == 0) {
                break;
            }
        }
        
        System.out.println("Martha plays " + count + " times before going broke.");

    }

}
