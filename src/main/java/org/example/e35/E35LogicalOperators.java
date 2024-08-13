package org.example.e35;

import java.util.Scanner;

public class E35LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input

        // Print prompt for user to answer if they need a loan
        // Capture the loan requirement input

        // Check if the user needs a loan

        // Step 1: Create a Scanner Object

        Scanner input=new Scanner(System.in);
        System.out.println("Do you need a loan? (true/false)");
        boolean needsLoan=input.nextBoolean();
        String eligibility;
        if(needsLoan){
            System.out.println("What is your credit score?");
            int CreditScore=input.nextInt();
            if(CreditScore<600){
                eligibility="Not eligible";
            }else if(CreditScore>=600&&CreditScore<=700){
                eligibility="Maybe eligible";
            }else if(CreditScore>=701&&CreditScore<=800){
                eligibility="Eligible";
            }else if(CreditScore>800){
                eligibility="Definitely eligible";
            }else{
                eligibility="Unknown";
            }
        }else{
            eligibility="Unknown";
        }
        System.out.println("The eligibility is "+eligibility);
    }
}
