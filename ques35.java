// Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw(). 
// Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred.
//-----------------------------------------------------------------------------------//
public class ques35 {
    public static void main(String[] args) {
        ques35SavingsAccount savingsAccount = new ques35SavingsAccount(1053465, 300);
        System.out.println(savingsAccount.getAmount());
    }
    
}
