// Write a Java program to create a class called Animal with a method called makeSound(). 
// Create a subclass called Cat that overrides the makeSound() method to bark.
//-----------------------------------------------------------------------------------//
public class ques33 {
    public static void main(String[] args) {
        
        ques33Animal animal = new ques33Animal();

        animal.makeSound();

        ques33Cat cat = new ques33Cat();

        cat.makeSound();
    }
    
}
