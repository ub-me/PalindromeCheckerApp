public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // UC1 — Welcome Message
        System.out.println("=================================");
        System.out.println("      PALINDROME CHECKER APP     ");
        System.out.println("=================================");
        System.out.println("Version : 1.0");

        // UC2 — Hardcoded Palindrome Check
        String word = "madam";   // hardcoded string
        String reversed = "";

        // Reverse the string
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Check palindrome
        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}