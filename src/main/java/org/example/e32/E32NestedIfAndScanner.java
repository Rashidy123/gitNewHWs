package org.example.e32;

import java.util.Scanner;

public class E32NestedIfAndScanner {
    public static void main(String[] args) {
        // Create a Scanner object to read input

        // Print prompt for user to enter gender
        // Capture the gender input

        // Print prompt for user to enter age
        // Capture the age input

        // Classify based on gender and age


        // Create a Scanner object to read input from the console
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your gender: M or F");
        String gender=input.nextLine();

        System.out.println("Please enter your age");
        int age=input.nextInt();

        if(age>25)
            if(gender.equalsIgnoreCase("F")){
                System.out.println("Woman");
            }else{
                System.out.println("Man");
            }
        if(age<25)
            if(gender.equalsIgnoreCase("M")){
                System.out.println("Boy");
            }else{
                System.out.println("Girl");
            }

    }
}
