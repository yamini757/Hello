public class PalindromeCheckerApp {


        public static void main(String[] args) {

            // Hardcoded string with spaces and mixed case
            String input = "Madam In Eden";

            // Normalize string (convert to lowercase and remove spaces)
            String normalized = input.toLowerCase().replaceAll("\\s+", "");

            boolean isPalindrome = true;

            int start = 0;
            int end = normalized.length() - 1;

            // Apply two-pointer palindrome logic
            while (start < end) {
                if (normalized.charAt(start) != normalized.charAt(end)) {
                    isPalindrome = false;
                    break;
                }
                start++;
                end--;
            }

            // Print result
            if (isPalindrome) {
                System.out.println("The given string \"" + input + "\" is a Palindrome (ignoring case and spaces).");
            } else {
                System.out.println("The given string \"" + input + "\" is NOT a Palindrome.");
            }
            System.out.println("-------------------------------");
        }
    }
