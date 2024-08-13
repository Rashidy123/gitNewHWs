package org.example.e38;

import java.util.Scanner;

public class E38LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input=new Scanner(System.in);

        // Print prompt for user to answer if it is the weekend
        // Capture the weekend input
        System.out.println("Is it weekend? (true/false)");
        boolean isWeekend=input.nextBoolean();

        // Determine the subject based on the input
        // If it is the weekend
        //    Set subject to "Java"
        // Otherwise
        //    Set subject to "manual testing"
        System.out.println("Are you available? (true/false)");
        boolean isAvailable=input.nextBoolean();

        if(isWeekend&&isAvailable) {
            System.out.println("Today you will be learning Java");
        }else if(!isWeekend&&isAvailable){
            System.out.println("Today you will be learning manual testing");
        }else{
            System.out.println("Today you will be learning no subject");
        }

        // Print the subject suggestion
        // Output: Today you will be learning ____


    }
}
