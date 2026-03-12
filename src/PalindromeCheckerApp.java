import java.util.Stack;

/**
 * UC13 - Performance comparison of palindrome algorithms
 * Measures execution time of different approaches.
 *
 * @author Yuvashree
 * @version 1.0
 */

public class PalindromeCheckerApp {

    // Two pointer method
    public static boolean twoPointerCheck(String text) {

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

    // Stack method
    public static boolean stackCheck(String text) {

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

    public static void main(String[] args) {

        String word = "racecar";

        // Two pointer timing
        long start1 = System.nanoTime();
        boolean result1 = twoPointerCheck(word);
        long end1 = System.nanoTime();

        // Stack timing
        long start2 = System.nanoTime();
        boolean result2 = stackCheck(word);
        long end2 = System.nanoTime();

        System.out.println("Two Pointer Result : " + result1);
        System.out.println("Execution Time : " + (end1 - start1) + " ns\n");

        System.out.println("Stack Result : " + result2);
        System.out.println("Execution Time : " + (end2 - start2) + " ns");
    }
}