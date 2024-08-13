package org.example.e28;

public class E28SimpleCalculatorElseIf {
    public static void main(String[] args) {
        // Declare a variable for operator and assign a value
        String operator="*";


        // Declare two variables for numbers and assign values
        int num1=25;
        int num2=2;
        int result=(num1+num2);
        int result1=(num1-num2);
        int result3=(num1*num2);
        int result4=(num1/num2);

        // Perform the corresponding arithmetic operation
        if(operator==("+")){
            System.out.println("The sum is: "+result);
        }else if(operator==("-")){
            System.out.println("The difference is: "+result1);
        }else if(operator==("*")){
            System.out.println("The product is: "+result3);
        }else if(operator==("/")){
            System.out.println("The quotient is: "+result4);
        }else{
            System.out.println("nvalid operator.");
        }


    }
}
