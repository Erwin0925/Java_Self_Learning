// Constructor with Validation
// Write a Java program to create a class called Account with instance variables accountNumber and balance. 
// Implement a parameterized constructor that initializes these variables with validation:

// accountNumber should be non-null and non-empty.
// balance should be non-negative.
// Print an error message if the validation fails.
//-----------------------------------------------------------------------------------//

public class ques19 {
    public static void main(String[] args) {
        //ques19Account account1 = new ques19Account(null, 100);
        //ques19Account account2 = new ques19Account(107283627333L, -100);
        ques19Account account3 = new ques19Account(107283627333L, 90);

        System.out.println(("Account number : ")+ account3.getAccountNumber());
        System.out.println("Balance : " + account3.getBalance());


    }
    
}
