/**
 * UC9 - Recursive Palindrome Checker
 * Checks whether a string is a palindrome using recursion.
 *
 * @author Yuvashree
 * @version 1.0
 */

public class PalindromeCheckerApp {

    // Recursive palindrome check
    public static boolean isPalindrome(String text, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // Compare characters
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindrome(text, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String word = "racecar";

        boolean result = isPalindrome(word, 0, word.length() - 1);

        if (result) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}