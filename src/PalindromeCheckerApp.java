import java.util.Scanner;

public class PalindromeCheckerApp {


        public static void main(String[] args) {
            // UC3: User Input Palindrome using String Reverse
            Scanner scanner = new Scanner(System.in);

            System.out.println("\nEnter a string to check palindrome:");
            String input = scanner.nextLine();

            String reverseInput = "";

            // Reverse using for loop
            for (int i = input.length() - 1; i >= 0; i--) {
                reverseInput += input.charAt(i);
            }

            // Compare original and reversed
            if (input.equals(reverseInput)) {
                System.out.println(input + " is a Palindrome");
            } else {
                System.out.println(input + " is Not a Palindrome");
            }

            scanner.close();
        }
}
