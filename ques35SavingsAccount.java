public class ques35SavingsAccount extends ques35BankAccount{

    public ques35SavingsAccount(int accountNumber, int amount) {
        super(accountNumber, amount);
    }

    @Override
    public void withdraw(int balance){
        if(getAmount() < 100){
            System.out.println("Fall over minimum balance");
        }else{
            super.withdraw(balance);
        }

    }
    
}
