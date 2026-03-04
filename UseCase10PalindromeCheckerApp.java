import java.util.Scanner;

public class UseCase10PalindromeCheckerApp {

    // Function to check palindrome after normalization
    public static boolean isPalindrome(String str) {

        // Remove spaces and convert to lowercase
        str = str.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println("It is a Palindrome (ignoring spaces and case)");
        } else {
            System.out.println("It is NOT a Palindrome");
        }

        sc.close();
    }
}