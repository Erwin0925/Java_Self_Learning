public class ques35BankAccount {

    private int accountNumber;
    private int amount;

    public ques35BankAccount(int accountNumber, int amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public void deposit(int balance){
        this.amount += balance;
    }

    public void withdraw(int balance){
        if(this.amount < balance){
            System.out.println("Insufficient Money");
        }else{
            this.amount -= balance;
        }
    }

    public int getAmount(){
        return amount;
    }
    
}
