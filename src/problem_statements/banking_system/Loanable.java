package day6.problem_statements.banking_system;

public interface Loanable {
    void applyForLoan(double amount);
    double calculateLoanEligibility();
}
