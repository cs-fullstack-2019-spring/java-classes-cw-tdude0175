package com.company.classwork;
//Create a simple Dog class calledDog in your com.company.classwork package.
//
//        An Dog should have name, bred, age and color properties
//        All properties should be able to be set via a Constructor
//        There should be getter methods for all properties
//        There should be a method to pretty print the properities of the dog
public class Dog {
    private String name;
    private String breed;
    private int age;

    public Dog(String newName, String newBreed, int newAge, String newColor)
    {
        this.name = newName;
        this.breed = newBreed;
        this.age = newAge;
        this.color = newColor;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    private String color;

    public String toString() {
        String output = " ";
        output = "Howdy! My name is " +this.name+"! \n I am a " + this.color +" "+ this.breed+ " " +this.age+" yrs old in Human years.";

        return output;
    }
}
