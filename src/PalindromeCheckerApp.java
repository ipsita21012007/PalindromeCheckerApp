import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class PalindromeCheckerApp {
    public static boolean isPalindrome(String input) {
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Step 1: Enqueue and Push characters
        for (char ch : input.toCharArray()) {
            queue.add(ch);   // Enqueue (FIFO)
            stack.push(ch);  // Push (LIFO)
        }

        // Step 2: Compare dequeue vs pop
        while (!queue.isEmpty() && !stack.isEmpty()) {
            char fromQueue = queue.remove(); // Dequeue
            char fromStack = stack.pop();    // Pop

            if (fromQueue != fromStack) {
                return false; // Mismatch found → Not a palindrome
            }
        }

        return true; // All matched → Palindrome
    }

    public static void main(String[] args) {
        String test1 = "madam";
        String test2 = "hello";

        System.out.println(test1 + " → Palindrome? " + isPalindrome(test1));
        System.out.println(test2 + " → Palindrome? " + isPalindrome(test2));
    }

}