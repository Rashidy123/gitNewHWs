package org.example.e12;

public class E12CalculateCostArithmeticConcat {
    public static void main(String[] args) {
        // Declare the float variables and assign values
        float item1=15.95f;
        float item2=19.59f;
        float item3=23.69f;
        float item4=16.75f;
        // Calculate the total cost
        float totalCost=(item1+item2+item3+item4);

        // Calculate the average cost
        float averageCost=(totalCost/4);

        // Print the results
      //  System.out.println("The total cost is " + totalCost);
        //System.out.println("The average cost is " + averageCost);
        System.out.println("The total cost is "+totalCost);
        System.out.println("The average cost is "+averageCost);

    }
}
