import java.util.Scanner;

public class PalindromeChecker {

    // Logic 1: Iterative method to check if the text is a palindrome
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false; // Characters do not match
            }
            start++;
            end--;
        }
        return true; // All characters matched
    }

    // Logic 2: Recursive method to check if the text is a palindrome
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true; // Base case: all characters matched
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false; // Characters do not match
        }
        return isPalindromeRecursive(text, start + 1, end - 1); // Recursive call
    }

    // Logic 3: Method to check if the text is a palindrome using character arrays
    public static boolean isPalindromeUsingCharArray(String text) {
        char[] originalArray = text.toCharArray(); // Convert string to char array
        char[] reverseArray = new char[originalArray.length];

        // Reverse the original array
        for (int i = 0; i < originalArray.length; i++) {
            reverseArray[i] = originalArray[originalArray.length - 1 - i];
        }

        // Compare original and reversed arrays
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reverseArray[i]) {
                return false; // Characters do not match
            }
        }
        return true; // All characters matched
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a text: ");
        String input = scanner.nextLine();

        // Check palindrome using all three methods
        boolean isPalindromeIterative = isPalindromeIterative(input);
        boolean isPalindromeRecursive = isPalindromeRecursive(input, 0, input.length() - 1);
        boolean isPalindromeCharArray = isPalindromeUsingCharArray(input);

        // Display results
        System.out.println("Palindrome Check Results:");
        System.out.println("Iterative Method: " + (isPalindromeIterative ? "Yes" : "No"));
        System.out.println("Recursive Method: " + (isPalindromeRecursive ? "Yes" : "No"));
        System.out.println("Character Array Method: " + (isPalindromeCharArray ? "Yes" : "No"));

        scanner.close();
    }
}