package tugas_3.exception;

public class BankAccount {
    private double balance;
    private final double MIN_BALANCE = 100.0;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }
    
    public void withdraw(double amount) throws InsufficientFundsException {
        try {
            if (this.balance - amount < this.MIN_BALANCE) {
                throw new InsufficientFundsException("Insufficient funds. Minimum balance required: $" + this.MIN_BALANCE);
            } else {
                System.out.println("Withdrawn: $" + amount);
                this.balance -= amount;
            }
        } catch (InsufficientFundsException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public double getBalance() {
        return balance;
    }
    
}
