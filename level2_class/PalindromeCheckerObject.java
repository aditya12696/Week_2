package Level2_class;

class PalindromeChecker {
    // Class attribute
    private String text;

    // Constructor
    PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        String cleanedText = text.toLowerCase();
        int length = cleanedText.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanedText.charAt(i) != cleanedText.charAt(length - 1 - i)) {
                // Not a palindrome
                return false;
            }
        }
        // Is a palindrome
        return true;
    }

    // Method to display the result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }
}

class PalindromeCheckerObject {
    public static void main(String[] args) {
        // Create objects of PalindromeChecker class
        PalindromeChecker checker1 = new PalindromeChecker("Madam");
        PalindromeChecker checker2 = new PalindromeChecker("Hello");

        // Check and display results
        checker1.displayResult();
        System.out.println("--------------------");
        checker2.displayResult();
    }
}
