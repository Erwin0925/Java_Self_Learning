public class ques19Account {
    private Long accountNumber;
    private double balance;

    public ques19Account(Long accountNumber, double balance){
        if (accountNumber == null) {
            throw new IllegalArgumentException("Account number cannot be null");
        }else{
            this.accountNumber = accountNumber;
        }

        if (balance <0){
            throw new IllegalArgumentException("Balance cannot be negative value");
        }else{
            this.balance = balance;
        }
    }
    
    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        if (balance <0){
            throw new IllegalArgumentException("Balance cannot be negative value");
        }else{
            this.balance = balance;
        }
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }
    
}
// Constructor with Validation
// Write a Java program to create a class called Account with instance variables accountNumber and balance. 
// Implement a parameterized constructor that initializes these variables with validation:

// accountNumber should be non-null and non-empty.
// balance should be non-negative.
// Print an error message if the validation fails.
//-----------------------------------------------------------------------------------//