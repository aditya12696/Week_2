package Day4;

import java.util.ArrayList;

// Bank class
class Bank {
    private String bankName; // Name of the bank
    private ArrayList<Customers> customers; // List of customers associated with the bank

    // Constructor to initialize bank
    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    // Method to add a customer to the bank
    public void addCustomer(Customers customer) {
        customers.add(customer);
        System.out.println("Customer " + customer.getName() + " has been added to " + bankName);
    }

    // Method to display bank details
    public void displayBankDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Customers:");
        for (Customers customer : customers) {
            customer.displayCustomerDetails();
            System.out.println("--------------------");
        }
    }
}

// Account class
class Account {
    private String accountNumber;
    private double balance;

    // Constructor to initialize account details
    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method to view account balance
    public void viewBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " into Account " + accountNumber);
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from Account " + accountNumber);
        } else {
            System.out.println("Insufficient balance in Account " + accountNumber);
        }
    }
}

// Customer class
class Customers {
    private String name;
    private ArrayList<Account> accounts; // A customer can have multiple accounts

    // Constructor to initialize customer details
    public Customers(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    // Method to get customer name
    public String getName() {
        return name;
    }

    // Method to open an account for the customer
    public void openAccount(String accountNumber, double initialBalance) {
        Account newAccount = new Account(accountNumber, initialBalance);
        accounts.add(newAccount);
        System.out.println("Account " + accountNumber + " opened for " + name);
    }

    // Method to view all accounts of the customer
    public void displayCustomerDetails() {
        System.out.println("Customer Name: " + name);
        System.out.println("Accounts:");
        for (Account account : accounts) {
            account.viewBalance();
        }
    }
}

// Main class
public class BankAndAccountHolders {
    public static void main(String[] args) {
        // Create a bank
        Bank bank = new Bank("Global Bank");

        // Create customers
        Customers customer1 = new Customers("Black");
        Customers customer2 = new Customers("Brown");

        // Add customers to the bank
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);

        // Open accounts for customers
        customer1.openAccount("A101", 5000.0);
        customer1.openAccount("A102", 3000.0);
        customer2.openAccount("B201", 10000.0);

        // Deposit and withdraw operations
        System.out.println();
        System.out.println("Performing Transactions:");
        customer1.displayCustomerDetails();
        customer2.displayCustomerDetails();

        System.out.println();
        bank.displayBankDetails();
    }
}
