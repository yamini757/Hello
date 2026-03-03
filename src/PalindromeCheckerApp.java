import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        // Hardcoded string
        String word = "madam";

        // Create Stack (LIFO)
        Stack<Character> stack = new Stack<>();

        // Create Queue (FIFO)
        Queue<Character> queue = new LinkedList<>();

        // Enqueue into queue and push into stack
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            stack.push(ch);     // Push into stack
            queue.add(ch);      // Enqueue into queue
        }

        boolean isPalindrome = true;

        // Compare dequeue and pop
        for (int i = 0; i < word.length(); i++) {
            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println("The given string \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The given string \"" + word + "\" is NOT a Palindrome.");
        }
    }
}