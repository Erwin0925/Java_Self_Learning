// Default Constructor:
// Write a Java program to create a class called "Cat" with instance variables name and age. 
// Implement a default constructor that initializes the name to "Unknown" and the age to 0. 
// Print the values of the variables.
//-----------------------------------------------------------------------------------//

public class ques14 {
    public static void main(String[] args) {
        ques14Cat cat = new ques14Cat();
        System.out.println("Cat name : " + cat.getName());
        System.out.println("Cat Age : " + cat.getAge());
    }
}
