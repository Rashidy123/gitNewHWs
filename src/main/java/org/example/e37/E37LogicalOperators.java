package org.example.e37;

import java.util.Scanner;

public class E37LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input=new Scanner(System.in);

        // Print prompt for user to answer if they are thirsty
        // Capture the thirsty input
        System.out.println("Are you thirsty? (true/false)");
        boolean isThirsty=input.nextBoolean();

        // Print prompt for user to answer if they are sleepy
        // Capture the sleepy input
        System.out.println("Are you sleepy? (true/false)");
        boolean isSleepy=input.nextBoolean();

        // Determine the drink based on the inputs
        if(isThirsty&&!isSleepy) {
            System.out.println("Looks like you need to drink water");
        }else if(isThirsty&&isSleepy){
            System.out.println("Looks like you need to drink coffee");
        }else if(!isThirsty&&isSleepy){
            System.out.println("Looks like you need to drink tea");
        }else{
            System.out.println("Looks like you need to drink nothing");
        }

            // Print the drink suggestion
            // Output: Looks like you need to drink ___

    }
}
