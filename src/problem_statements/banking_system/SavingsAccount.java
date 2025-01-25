package day6.problem_statements.banking_system;

public class SavingsAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.03; // 3% annual interest

    // Constructor
    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    // Implement calculateInterest
    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    // Implement Loanable methods
    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan application received for Savings Account: " + amount);
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 5; // Eligibility is 5x balance
    }
}
