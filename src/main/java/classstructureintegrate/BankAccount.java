package classstructureintegrate;

public class BankAccount {
    private String accountNumber;
    private String owner;
    private int balance;

    public BankAccount (String accountNumber, String owner, int balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(int deposit) {
        this.balance += deposit;
    }
    public void withdraw(int withdraw) {
        this.balance -= withdraw;
    }
    public void transfer(BankAccount transfer, int amount) {
        transfer.balance += amount;
        this.balance -= amount;
    }

    public String getOwner() {
        return owner;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public int getBalance() {
        return balance;
    }

    public void getInfo() {
        System.out.println("(" + getAccountNumber() + "):" + " " + getBalance() + " Ft" );
    }
}
