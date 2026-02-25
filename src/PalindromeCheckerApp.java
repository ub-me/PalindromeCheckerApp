public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("      PALINDROME CHECKER APP     ");
        System.out.println("=================================");
        System.out.println("Use Case 6 : Queue + Stack Method");

        String original = "level";

        java.util.Queue<Character> queue = new java.util.LinkedList<>();
        java.util.Stack<Character> stack = new java.util.Stack<>();

        // insert characters
        for (int i = 0; i < original.length(); i++) {
            queue.add(original.charAt(i));   // enqueue
            stack.push(original.charAt(i));  // push
        }

        boolean isPalindrome = true;

        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is NOT a Palindrome");
        }
    }
}