package org.example.e43;

import java.util.Scanner;

public class E43SwitchStatment {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input=new Scanner(System.in);
        // Print prompt for user to enter their electricity usage in kWh
        // Capture the usage input
        System.out.println("Enter your electricity usage in kWh");
        int usage=input.nextInt();
        double bill;
        if(usage<0){
            System.out.println("Invalid usage entered");
        }

        // Calculate bill using switch statement
        switch(usage/100){
            case 0:
                bill=usage*0.12;
                break;
            case 1:
                bill=usage*0.15;
                break;
            case 2:
                bill=usage*0.20;
                break;
            default:
                bill=usage*0.25;
                break;
        }
        // Print the bill
        // Output: Your electricity bill is $____








    }
}
