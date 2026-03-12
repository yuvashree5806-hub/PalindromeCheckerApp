import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * PalindromeStrategy interface
 * Defines the contract for palindrome checking algorithms
 */
interface PalindromeStrategy {
    boolean checkPalindrome(String text);
}

/**
 * Stack-based palindrome strategy
 */
class StackStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String text) {

        Stack<Character> stack = new Stack<>();

        for (char c : text.toCharArray()) {
            stack.push(c);
        }

        for (char c : text.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

/**
 * Deque-based palindrome strategy
 */
class DequeStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String text) {

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : text.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {

            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }

        return true;
    }
}

/**
 * Context class that uses strategy
 */
class PalindromeChecker {

    private PalindromeStrategy strategy;

    public PalindromeChecker(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean check(String text) {
        return strategy.checkPalindrome(text);
    }
}

/**
 * Application entry point
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "level";

        // Choose strategy dynamically
        PalindromeChecker checker =
                new PalindromeChecker(new StackStrategy());

        if (checker.check(word)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}