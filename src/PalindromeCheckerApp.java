public class PalindromeCheckerApp {
    public static void main(String[] args) {



                // Hardcoded String (String Literal)
                String word = "madam";

                // Variable to store result
                boolean isPalindrome = true;

                int length = word.length();

                // Checking palindrome condition
                for (int i = 0; i < length / 2; i++) {
                    if (word.charAt(i) != word.charAt(length - i - 1)) {
                        isPalindrome = false;
                        break;
                    }
                }

                // Printing result using if-else
                if (isPalindrome) {
                    System.out.println("The given string \"" + word + "\" is a Palindrome.");
                } else {
                    System.out.println("The given string \"" + word + "\" is NOT a Palindrome.");
                }

            }
        }


