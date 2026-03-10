public class PalindromeCheckerApp {

    // Reverse String Method
    static boolean reverseMethod(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return input.equals(reversed);
    }

    // Stack Method
    static boolean stackMethod(String input) {
        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return input.equals(reversed);
    }

    // Deque Method
    static boolean dequeMethod(String input) {
        java.util.Deque<Character> deque = new java.util.ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("      PALINDROME CHECKER APP     ");
        System.out.println("=================================");
        System.out.println("Use Case 13 : Performance Comparison");

        String input = "racecar";

        // Reverse Method timing
        long start1 = System.nanoTime();
        boolean r1 = reverseMethod(input);
        long end1 = System.nanoTime();

        // Stack Method timing
        long start2 = System.nanoTime();
        boolean r2 = stackMethod(input);
        long end2 = System.nanoTime();

        // Deque Method timing
        long start3 = System.nanoTime();
        boolean r3 = dequeMethod(input);
        long end3 = System.nanoTime();

        System.out.println("\nInput String : " + input);

        System.out.println("\nReverse Method Result : " + r1);
        System.out.println("Execution Time : " + (end1 - start1) + " ns");

        System.out.println("\nStack Method Result : " + r2);
        System.out.println("Execution Time : " + (end2 - start2) + " ns");

        System.out.println("\nDeque Method Result : " + r3);
        System.out.println("Execution Time : " + (end3 - start3) + " ns");
    }
}