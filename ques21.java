// Constructor for Singleton Pattern
// Write a Java program to create a class called Singleton that ensures only one instance of the class can be created. 
// Implement a private constructor and a public static method to get the single instance of the class. 
// Print a message indicating the creation of the instance.
//-----------------------------------------------------------------------------------//

public class ques21 {
    public static void main(String[] args) {
        ques21Singleton instance1 = ques21Singleton.getInstance();

        ques21Singleton instance2 = ques21Singleton.getInstance();
        
        if(instance1 == instance2){
            System.out.println("Both instance are same");
        }else{
            System.out.println("Both instance are different");
        }
    }
    
}
