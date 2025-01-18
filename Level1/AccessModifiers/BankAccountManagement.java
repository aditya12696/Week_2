package Day2.Level1.AccessModifiers;

public class BankAccountManagement {
    public static void main(String[] args) {
        // Creating a regular bank account
        BankAccount account = new BankAccount("123456789", "Alice", 10000.0);
        System.out.println("Bank Account Details:");
        account.displayAccountDetails();

        System.out.println("--------------------\n");

        // Depositing and withdrawing money
        account.deposit(2000.0);
        account.withdraw(1500.0);
        System.out.println("Updated Bank Account Details:");
        account.displayAccountDetails();

        System.out.println("--------------------\n");

        // Creating a savings account
        SavingsAccount savingsAccount = new SavingsAccount("987654321", "Bob", 15000.0, 5.0);
        System.out.println("Savings Account Details:");
        savingsAccount.displayAccountDetails();

        System.out.println("--------------------");
        // Calculating interest
        savingsAccount.calculateInterest();
    }
}

class BankAccount {
    // Attributes
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    // Constructor to initialize bank account details
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    // Method to get the account balance
    public double getBalance() {
        return balance;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

// Subclass to demonstrate access to accountNumber and accountHolder
class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor to initialize savings account details
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Method to calculate interest
    public void calculateInterest() {
        double interest = getBalance() * interestRate / 100;
        System.out.println("Interest: " + interest);
    }

    // Method to display savings account details
    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
