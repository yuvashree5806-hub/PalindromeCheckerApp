/**
 * UC11 - Encapsulation of Palindrome Logic
 * Demonstrates OOP concepts such as encapsulation
 * and single responsibility principle.
 *
 * @author Yuvashree
 * @version 1.0
 */

class PalindromeChecker {

    // Method that checks if a string is a palindrome
    public boolean checkPalindrome(String text) {

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
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        PalindromeChecker checker = new PalindromeChecker();

        String input = "Madam";

        if (checker.checkPalindrome(input)) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }
    }
}