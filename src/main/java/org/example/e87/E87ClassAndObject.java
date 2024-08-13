package org.example.e87;

public class E87ClassAndObject {
    public static void main(String[] args) {
        // Create a class named 'Car'

        // Declare a String variable named 'carColor'
        // Declare an integer variable named 'carYear'
        // Declare a String variable named 'carMake'

        // Create the first object of the class 'Car'
        Car car=new Car();

        // Assign the value "Black" to the 'carColor' variable of the first object
        // Assign the value 2019 to the 'carYear' variable of the first object
        // Assign the value "BMW" to the 'carMake' variable of the first object
        car.carColor="Car color is Black and car year is ";
        car.carYear=2019;
        car.carMake=" and car model is BMW";

        // Create the second object of the class 'Car'
        Car car1=new Car();

        // Assign the value "White" to the 'carColor' variable of the second object
        // Assign the value 2018 to the 'carYear' variable of the second object
        // Assign the value "Toyota" to the 'carMake' variable of the second object
        car1.carColor="Car color is White and car year is ";
        car1.carYear=2018;
        car1.carMake=" and car model is Toyota";
        // Print the values of the properties for both objects in the specified format
        System.out.println(car.carColor+car.carYear+car.carMake);
        System.out.println(car1.carColor+car1.carYear+car1.carMake);



    }
}
