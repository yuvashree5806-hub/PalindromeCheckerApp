/**
 * UC10 - Palindrome Checker ignoring spaces and case
 * Demonstrates string preprocessing before checking palindrome.
 *
 * @author Yuvashree
 * @version 1.0
 */

public class PalindromeCheckerApp {

    // Method to check palindrome after preprocessing
    public static boolean isPalindrome(String text) {

        // Normalize string: remove spaces and convert to lowercase
        text = text.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = text.length() - 1;

        while (start < end) {

            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        String input = "Never Odd Or Even";

        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" is a Palindrome");
        } else {
            System.out.println("\"" + input + "\" is NOT a Palindrome");
        }
    }
}