// Anonymous Class Implementing Abstract Class:
// Write a Java program to create an abstract class called Animal with an abstract method makeSound(). 
// In the main method, create an anonymous class that extends Animal and override the makeSound() method to print "Meow" for a cat. 
// Call the makeSound() method.
//-----------------------------------------------------------------------------------//
public class ques31 {
    public static void main(String[] args) {
        ques31Animal animal = new ques31Animal() {
            @Override
            void makeSound() {
                System.out.println("Meow");  
            }
        };

        animal.makeSound();

    }
  
}
