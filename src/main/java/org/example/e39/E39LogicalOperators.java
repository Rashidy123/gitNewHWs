package org.example.e39;

import java.util.Scanner;

public class E39LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input=new Scanner(System.in);

        // Print prompt for user to enter their mark
        // Capture the mark input
        System.out.println("Please enter your mark");
        int mark=input.nextInt();
        // Determine the grade based on the mark
        if(mark<=25 && mark>=1){
            System.out.println("Your grade is F");
        }else if(mark<=45 && mark>=26){
            System.out.println("Your grade is E");
        }else if(mark<=50 && mark>=46){
            System.out.println("Your grade is D");
        }else if(mark<=60 && mark>=51){
            System.out.println("Your grade is C");
        }else if(mark<=80 && mark>=61){
            System.out.println("Your grade is B");
        }else if(mark>=80){
            System.out.println("Your grade is A");
        }else{
            System.out.println("Please enter valid mark");
        }


        // Print the grade
        // Output: Your grade is ____



    }
}
