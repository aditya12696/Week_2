package day6.problem_statements.banking_system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of BankAccount objects
        List<BankAccount> accounts = new ArrayList<>();

        // Add SavingsAccount and CurrentAccount to the list
        accounts.add(new SavingsAccount("SA101", "Smith", 10000));
        accounts.add(new CurrentAccount("CA202", "Johan", 20000));

        // Process each account
        for (BankAccount account : accounts) {
            System.out.println("---------------------");
            System.out.println("Account Holder: " + account.getHolderName());
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Account Balance: " + account.getBalance());

            // Calculate and display interest dynamically
            System.out.println("Interest: " + account.calculateInterest());

            if (account instanceof Loanable) {
                Loanable loanableAccount = (Loanable) account;
                loanableAccount.applyForLoan(5000);
                System.out.println("Loan Eligibility: " + loanableAccount.calculateLoanEligibility());
            }
        }
    }
}

