import java.util.Stack;

public class PalindromeCheckerApp {

    // Method 1: Reverse String
    public static boolean reverseCheck(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        return word.equals(reversed);
    }

    // Method 2: Two Pointer
    public static boolean twoPointerCheck(String word) {
        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Method 3: Stack
    public static boolean stackCheck(String word) {
        Stack<Character> stack = new Stack<>();

        for (char c : word.toCharArray()) {
            stack.push(c);
        }

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String word = "madam";

        // Reverse method timing
        long start1 = System.nanoTime();
        boolean result1 = reverseCheck(word);
        long end1 = System.nanoTime();

        // Two pointer timing
        long start2 = System.nanoTime();
        boolean result2 = twoPointerCheck(word);
        long end2 = System.nanoTime();

        // Stack method timing
        long start3 = System.nanoTime();
        boolean result3 = stackCheck(word);
        long end3 = System.nanoTime();

        // Print results
        System.out.println("Reverse Method Result: " + result1 +
                " | Time: " + (end1 - start1) + " ns");

        System.out.println("Two Pointer Method Result: " + result2 +
                " | Time: " + (end2 - start2) + " ns");

        System.out.println("Stack Method Result: " + result3 +
                " | Time: " + (end3 - start3) + " ns");
    }
}