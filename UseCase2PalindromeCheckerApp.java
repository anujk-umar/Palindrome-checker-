/**
 * UseCase2: Print a Hardcoded Palindrome Result
 * Palindrome Checker App
 */
public class UseCase2PalindromeCheckerApp {

    /**
     * Main method – Entry point of the application
     */
    public static void main(String[] args) {

        // Hardcoded string (String Literal)
        String word = "madam";

        // Reverse the string
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Conditional check using if-else
        if (word.equals(reversed)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}


