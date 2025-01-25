package day6.problem_statements.banking_system;

public class CurrentAccount extends BankAccount implements Loanable {
    private static final double OVERDRAFT_LIMIT = 5000; // Overdraft limit
    private static final double INTEREST_RATE = 0.01; // 1% annual interest

    // Constructor
    public CurrentAccount(String accountNumber, String holderName, double balance) {
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
        System.out.println("Loan application received for Current Account: " + amount);
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() + OVERDRAFT_LIMIT; // Eligibility includes overdraft limit
    }
}

