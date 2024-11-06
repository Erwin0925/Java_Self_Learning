// Parameterized Constructor:
// Write a Java program to create a class called Dog with instance variables name and color. 
// Implement a parameterized constructor that takes name and color as parameters and initializes the instance variables. 
// Print the values of the variables
//-----------------------------------------------------------------------------------//
public class ques15 {
    public static void main(String[] args) {
        ques15Dog dog = new ques15Dog("ah zhong", "brown-white");
        System.err.println("Name");
        System.err.println("Dog name : " + dog.getName());
        System.err.println("Dog color : " + dog.getColor());

        dog.setName("abuji");
        dog.setColor("brown");
        System.err.println("New Name");
        System.err.println("Dog name : " + dog.getName());
        System.err.println("Dog color : " + dog.getColor());

    }
    
}
