public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("      PALINDROME CHECKER APP     ");
        System.out.println("=================================");
        System.out.println("Use Case 9 : Recursive Method");

        String original = "madam";

        boolean result = isPalindrome(original, 0, original.length() - 1);

        if (result) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is NOT a Palindrome");
        }
    }

    // recursive function
    static boolean isPalindrome(String str, int start, int end) {

        // base condition
        if (start >= end)
            return true;

        if (str.charAt(start) != str.charAt(end))
            return false;

        return isPalindrome(str, start + 1, end - 1);
    }
}