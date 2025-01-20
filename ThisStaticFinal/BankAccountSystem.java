package Day3;

class BankAccount {
    // Static variable
    private static String bankName = "Default Bank";
    private static int totalAccounts = 0;

    // Instance variables
    private String accountHolderName;
    private final int accountNumber; // Final variable

    // Constructor to initialize account details
    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    // Static method to get total accounts
    public static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    // Instance method to display account details
    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        } else {
            System.out.println("Invalid account object.");
        }
    }

    // Static method to update bank name
    public static void updateBankName(String newBankName) {
        bankName = newBankName;
    }
}

public class BankAccountSystem {
    public static void main(String[] args) {
        // Creating account objects
        BankAccount account1 = new BankAccount("Aditya", 1001);
        BankAccount account2 = new BankAccount("John", 1002);

        // Displaying initial account details
        System.out.println("Initial Account Details:");
        account1.displayAccountDetails();
        System.out.println("--------------------");
        account2.displayAccountDetails();
        System.out.println("--------------------");

        // Updating the bank name
        BankAccount.updateBankName("Tech Bank");

        // Displaying updated account details
        System.out.println("Updated Account Details:");
        account1.displayAccountDetails();
        System.out.println("--------------------");
        account2.displayAccountDetails();
        System.out.println("--------------------");

        // Displaying total accounts
        BankAccount.getTotalAccounts();
    }
}
