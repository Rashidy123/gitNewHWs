package org.example.e25;

public class E25DailyExpenseTrackerIfConditions {
    public static void main(String[] args) {
        // Assign values to daily expenses
        double morningExpense=25.41;
        double afternoonExpense=25.41;
        double eveningExpense=25.43;


        // Calculate total expense
        double totalExpense=( morningExpense+afternoonExpense+eveningExpense);


        // Define a budget
        double budget=100.0;


        // Check if within budget
        System.out.println("Your total daily expense is: "+totalExpense);
        if(totalExpense>=76.25){
            System.out.println("You are within the budget.");

        }



        }


    }

