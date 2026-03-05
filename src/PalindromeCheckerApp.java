public class PalindromeCheckerApp {


        public static void main(String[] args) {
            String word = "madam";
            String reverse = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                reverse += word.charAt(i);
            }

            if (word.equals(reverse)) {
                System.out.println(word + " is a Palindrome");
            } else {
                System.out.println(word + " is Not a Palindrome");
            }
        }
}
