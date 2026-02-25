public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("      PALINDROME CHECKER APP     ");
        System.out.println("=================================");
        System.out.println("Use Case 4 : Character Array Method");

        String original = "level";

        char[] chars = original.toCharArray();

        int start = 0;
        int end = chars.length - 1;

        boolean isPalindrome = true;

        while(start < end) {
            if(chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if(isPalindrome) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is NOT a Palindrome");
        }
    }
}