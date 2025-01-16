package Level2_class;

class BankAccount {
    // Class attributes
    private String accountHolder;
    private int accountNumber;
    private double balance;

    // Constructor
    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    public void depositMoney(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdrawMoney(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to display the current balance
    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: $" + balance);
    }
}

class BankAccountObject {
    public static void main(String[] args) {
        // Create objects of BankAccount class
        BankAccount account1 = new BankAccount("Alice", 101, 500.00);
        BankAccount account2 = new BankAccount("Bob", 102, 1000.00);

        // Perform operations on account1
        account1.depositMoney(200);
        account1.withdrawMoney(100);
        account1.displayBalance();

        System.out.println("--------------------\n");

        // Perform operations on account2
        account2.depositMoney(500);
        account2.withdrawMoney(1500);
        account2.displayBalance();
    }
}
