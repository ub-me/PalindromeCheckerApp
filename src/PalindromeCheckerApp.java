public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("      PALINDROME CHECKER APP     ");
        System.out.println("=================================");
        System.out.println("Use Case 5 : Stack Method");

        String original = "level";

        java.util.Stack<Character> stack = new java.util.Stack<>();

        // push characters into stack
        for(int i = 0; i < original.length(); i++) {
            stack.push(original.charAt(i));
        }

        String reversed = "";

        // pop characters
        while(!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        if(original.equals(reversed)) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is NOT a Palindrome");
        }
    }
}