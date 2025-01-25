package Day5.HierarchicalInheritance;

// Base class: BankAccount
class BankAccount {
    protected String accountNumber;
    protected double balance;

    // Constructor for BankAccount
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to display basic account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    // Method to display account type (overridden by subclasses)
    public void displayAccountType() {
        System.out.println("General Bank Account");
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
    private double interestRate; // Annual interest rate in percentage

    // Constructor for SavingsAccount
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance); // Call the BankAccount constructor
        this.interestRate = interestRate;
    }

    // Method to calculate yearly interest
    public double calculateYearlyInterest() {
        return (balance * interestRate) / 100;
    }

    // Override displayAccountType
    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }

    // Override displayAccountDetails to include interest rate
    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Subclass: CheckingAccount
class CheckingAccount extends BankAccount {
    private double withdrawalLimit; // Daily withdrawal limit

    // Constructor for CheckingAccount
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance); // Call the BankAccount constructor
        this.withdrawalLimit = withdrawalLimit;
    }

    // Override displayAccountType
    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }

    // Override displayAccountDetails to include withdrawal limit
    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Withdrawal Limit: $" + withdrawalLimit + " per day");
    }
}

// Subclass: FixedDepositAccount
class FixedDepositAccount extends BankAccount {
    private int depositTerm; // Term in months
    private double interestRate; // Interest rate for the term

    // Constructor for FixedDepositAccount
    public FixedDepositAccount(String accountNumber, double balance, int depositTerm, double interestRate) {
        super(accountNumber, balance); // Call the BankAccount constructor
        this.depositTerm = depositTerm;
        this.interestRate = interestRate;
    }

    // Method to calculate maturity amount
    public double calculateMaturityAmount() {
        return balance + (balance * interestRate * depositTerm) / (100 * 12); // Simple interest formula
    }

    // Override displayAccountType
    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }

    // Override displayAccountDetails to include deposit term and interest rate
    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Deposit Term: " + depositTerm + " months");
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Maturity Amount: $" + calculateMaturityAmount());
    }
}

// Main class
public class BankAccountTypes {
    public static void main(String[] args) {
        // Create a SavingsAccount
        SavingsAccount savings = new SavingsAccount("SA123", 5000, 4.5);
        System.out.println("Savings Account Details:");
        savings.displayAccountType();
        savings.displayAccountDetails();
        System.out.println();

        // Create a CheckingAccount
        CheckingAccount checking = new CheckingAccount("CA456", 3000, 1000);
        System.out.println("Checking Account Details:");
        checking.displayAccountType();
        checking.displayAccountDetails();
        System.out.println();

        // Create a FixedDepositAccount
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD789", 10000, 12, 6.0);
        System.out.println("Fixed Deposit Account Details:");
        fixedDeposit.displayAccountType();
        fixedDeposit.displayAccountDetails();
    }
}

