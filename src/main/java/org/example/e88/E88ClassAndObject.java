package org.example.e88;

public class E88ClassAndObject {

    public static void main(String[] args) {
        // Create a class named 'Dog'

        // Declare String variables named 'breed', 'name', and 'color'

        // Declare methods named 'bark()', 'run()', and 'play()' that print messages in the specified format

        // Create the first object of the class 'Dog' with breed = "Husky", name = "AnyName", color = "AnyColor"
        Dog dog=new Dog();
        dog.breed="Husky";
        dog.name="AnyName";
        dog.color="AnyColor";

        // Create the second object of the class 'Dog' with breed = "Bulldog", name = "AnyName", color = "AnyColor"
        Dog dog1=new Dog();
        dog1.breed="Bulldog";
        dog1.name="AnyName";
        dog1.color="AnyColor";


        // Create the third object of the class 'Dog' with breed = "Labrador", name = "AnyName", color = "AnyColor"
        Dog dog2=new Dog();
        dog2.breed="Labrador";
        dog2.name="AnyName";
        dog2.color="AnyColor";


        // Call the methods 'bark()', 'run()', and 'play()' for each object
        System.out.print(dog.breed+" ");
        dog.bark();
        System.out.print(dog.breed+" ");
        dog.run();
        System.out.print(dog.breed+" ");
        dog.play();
        System.out.print(dog1.breed+" ");
        dog1.bark();
        System.out.print(dog1.breed+" ");
        dog1.run();
        System.out.print(dog1.breed+" ");
        dog1.play();
        System.out.print(dog2.breed+" ");
        dog2.bark();
        System.out.print(dog2.breed+" ");
        dog2.run();
        System.out.print(dog2.breed+" ");
        dog2.play();

    }
}
